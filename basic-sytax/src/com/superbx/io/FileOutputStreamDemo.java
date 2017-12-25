package com.superbx.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 演示文件字节输出流
 */
public class FileOutputStreamDemo {
	public static void main(String[] args) throws IOException {
		//1、创建目标对象，表示把数据保存到哪一个文件
		File target = new File("stream.txt"); //不指定目录就会默认当前目录
		//2、创建文件字节输出流对象（水管）
		FileOutputStream out = new FileOutputStream(target, false); //是否追加数据
		//3、具体的输出操作(往外写操作)
		/*
		 * void write(int b) 把一个字节写到文件中
		 * void write(byte[] b) 把数组b中所有的字节都写到文件中去
		 * void write(byte[] b, int off, int len) 把数组b中的数据，从off开始写入len长度的数据
		 */
		//out.write(65);写入A
		//out.write("ABCDE".getBytes());写入ABCDE
		out.write("liuxianglin will be java engineer".getBytes(), 10, 16);
		//4、关闭资源对象
		out.close();
	}
}
