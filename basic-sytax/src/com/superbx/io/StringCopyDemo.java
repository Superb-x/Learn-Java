package com.superbx.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 使用字节流完成文件的拷贝操作
 */
public class StringCopyDemo {
	public static void main(String[] args) throws IOException {
		//1、创建源
		File src = new File("stream.txt");
		File dest = new File("stream_copy.txt");
		//2、创建输入的管道
		FileInputStream in = new FileInputStream(src);
		FileOutputStream out = new FileOutputStream(dest);
		//3、通过输入流进行读取操作
		byte[] buffer = new byte[10]; //通常是1024，这里是创建一个容量为10的缓冲区
		int len = -1;//表示已经读取了多少个字节数，如果是-1表明文件已经读取到最后了
		while((len = in.read(buffer)) != -1) {
			//打印一下：读取的数据
			//System.out.println(new String(buffer, 0, len));
			//数据在buffer数组中，边读边写
			out.write(buffer, 0, len);
		}
		//4、关闭管道
		in.close();
		out.close();
	}
}
