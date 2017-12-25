package com.superbx.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

/*
 * 演示文件字节输入流
 */
public class FileInputStreamDemo {
	public static void main(String[] args) throws IOException {
		//1、创建源（挖水井）
		File file = new File("stream.txt");
		//2、创建文件字节输入流对象，并接在源上
		FileInputStream input = new FileInputStream(file);
		//3、读取操作
		/*
		 * int read() 读取一个字节的数据
		 * int read(byte[] b) 读取多个字节，并存储到数组b中，从数组的索引位置为0的位置开始存，返回读取了字节的长度
		 * int raed(byte[] b, int off, int len) 读取多个字节，并存储到数组b中，从数组的off位置开始存储len个字节的数据
		 */
		//int data = input.read(); //读取stream.txt中的第一个字节
		byte[] buffer = new byte[5];//此时最多存储5个字节
		//input.read(buffer); //如果你不读取的话，就会默认显示成5个0
		//System.out.println(Arrays.toString(buffer));
		//把byte[]转换为字符串
		//String str = new String(buffer);
		//System.out.println(str);
		//把文件中所有的数据都读取到程序中
		int len = -1;//表示当前读取的字节总数，如果为-1表示读取到末尾了
		while((len = input.read(buffer)) != -1) {
			String str = new String(buffer, 0, len);
			System.out.println(str);
		}
		//4、关闭资源
		input.close();
	}
}
