package com.superbx.io.reader_writer;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

/*
 * 使用文件字符流实现文件的 拷贝，前提是文件必须是文本
 */
public class FileCopyDemo {
	public static void main(String[] args) throws IOException {
		//1、创建源
		File srcFile = new File("file/ch3.txt");
		File destFile = new File("file/ch3_copy.txt");
		//2、创建输入流和输出流对象（创建管道）
		Reader in = new FileReader(srcFile);
		Writer out = new FileWriter(destFile);
		//3、读取操作
		char[] buffer = new char[100]; //每次读取1024个字符
		int len = -1;
		len = in.read(buffer);
		while(len > 0){
			out.write(buffer, 0, len);
			len = in.read(buffer);
		}
		//4、关闭源
		in.close();
		out.close();
	}
}
