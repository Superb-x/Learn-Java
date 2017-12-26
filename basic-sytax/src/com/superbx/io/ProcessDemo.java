package com.superbx.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/*
 * ��ȡ�������ݵ�ʾ��
 * �������̵ķ�����������eval����
 */
public class ProcessDemo {
	public static void main(String[] args) throws IOException {
		String str = "System.out.println(\"�����ã���ϵ�����֣���ϵ�����ԣ�����һ��̰�����£�ж��������\")";
		eval(str);
	}
	
	//ִ��str���������ڿ���̨��ӡ����������ã���ϵ�����֣���ϵ�����ԣ�����һ��\"̰������\"��ж��������
	private static void eval(String str) throws IOException {
		//1��ʹ��StringBuilderƴ��һ��������helloworld����
		StringBuilder sb = new StringBuilder(80);
		sb.append("public class Hello{");
		sb.append("public static void main(String[] args){");
		sb.append(str);
		sb.append(";");
		sb.append("}");
		sb.append("}");
		System.out.println(sb);
		//2�����浽һ������Hello.java���ļ���
		OutputStream out = new FileOutputStream("Hello.java");
		out.write(sb.toString().getBytes());
		//�ر���
		out.close();
		//3������Javac������ִ�б���Hello.java
		Process javacProcess = Runtime.getRuntime().exec("javac Hello.java");
		//4����ȡjavac�����еĴ�������Ϣ
		InputStream error = javacProcess.getErrorStream();
		//��ȡ���е�����
		byte[] buffer = new byte[1024];
		int len = -1;
		while((len = error.read(buffer)) > 0){
			String msg = new String(buffer, 0, len);
			System.out.println(msg);
		}
		//5������Java����������Hello�ֽ���
		Process javaProcess = Runtime.getRuntime().exec("java Hello");
		//6����ȡJava�����е�����Ϣ
		InputStream info = javaProcess.getInputStream();
		//��ȡ���е�����
		while((len = info.read(buffer)) > 0) {
			String msg = new String(buffer, 0, len);
			System.out.println(msg);
		}
		//�رգ���Ҫ��һ��Ҫ�ǵ�
		error.close();
	}
}
