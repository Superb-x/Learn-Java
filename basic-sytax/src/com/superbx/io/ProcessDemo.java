package com.superbx.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/*
 * 获取进程数据的示例
 * 操作进程的方法，类似于eval方法
 */
public class ProcessDemo {
	public static void main(String[] args) throws IOException {
		String str = "System.out.println(\"大渣好，唔系古天乐，唔系渣渣辉，跟我一起贪玩蓝月，卸载算我输\")";
		eval(str);
	}
	
	//执行str参数，并在控制台打印输出，大渣好，唔系古天乐，唔系渣渣辉，跟我一起\"贪玩蓝月\"，卸载算我输
	private static void eval(String str) throws IOException {
		//1、使用StringBuilder拼接一个完整的helloworld程序
		StringBuilder sb = new StringBuilder(80);
		sb.append("public class Hello{");
		sb.append("public static void main(String[] args){");
		sb.append(str);
		sb.append(";");
		sb.append("}");
		sb.append("}");
		System.out.println(sb);
		//2、保存到一个名叫Hello.java的文件中
		OutputStream out = new FileOutputStream("Hello.java");
		out.write(sb.toString().getBytes());
		//关闭流
		out.close();
		//3、调用Javac进程来执行编译Hello.java
		Process javacProcess = Runtime.getRuntime().exec("javac Hello.java");
		//4、读取javac进程中的错误流信息
		InputStream error = javacProcess.getErrorStream();
		//读取流中的数据
		byte[] buffer = new byte[1024];
		int len = -1;
		while((len = error.read(buffer)) > 0){
			String msg = new String(buffer, 0, len);
			System.out.println(msg);
		}
		//5、调用Java进程来运行Hello字节码
		Process javaProcess = Runtime.getRuntime().exec("java Hello");
		//6、读取Java进程中的流信息
		InputStream info = javaProcess.getInputStream();
		//读取流中的数据
		while((len = info.read(buffer)) > 0) {
			String msg = new String(buffer, 0, len);
			System.out.println(msg);
		}
		//关闭，重要，一定要记得
		error.close();
	}
}
