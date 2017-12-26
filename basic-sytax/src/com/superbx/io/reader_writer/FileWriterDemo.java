package com.superbx.io.reader_writer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/*
 * 字符输出流操作示例
 */
public class FileWriterDemo {
	public static void main(String[] args) throws IOException {
		//1、创建目标
		File destFile = new File("file/ch2.txt");
		//2、创建字符输出流对象
		Writer out = new FileWriter(destFile, false); //是否追加
		//3、写出操作
		/*
		 * void write(int c);向外写出一个字符
		 * void write(char[] cbuf); 向外写出多个字符
		 * void write(char[], off, len); 从off开始向外写出len个字符
		 * void write(String str); 向外写出一个字符串
		 */
		out.write("ABCDEFG");
		out.write("\n");
		out.write("Hello, java".toCharArray(), 3, 2);
		//4、关闭流，一定要关闭，系统会在关闭之前调用flush方法
		out.close();
	}
}
