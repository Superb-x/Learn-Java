package com.superbx.io.reader_writer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/*
 * 文件的字符输入流示例
 */
public class FileReaderDemo {
	public static void main(String[] args) throws IOException {
		//1、创建或指定源
		File srcFile = new File("file/ch.txt");
		//2、创建流对象
		Reader in = new FileReader(srcFile);
		//3、读取操作
		/*
		 * int read(); 每次读取一个字节，读取到末尾返回-1
		 * int read(char[] buffer); 每次读取多个字符，把读取的字符存储到buffer数组中，读取到末尾返回-1
		 * 
		 */
		char[] buffer = new char[5]; //每次读取5个字符
		int len = -1;
		while((len = in.read(buffer)) > 0) {
			System.out.println(buffer);
		}
		//4、关闭流
		in.close();
	}
}
