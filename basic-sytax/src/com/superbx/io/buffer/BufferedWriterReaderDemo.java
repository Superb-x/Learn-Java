package com.superbx.io.buffer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 字符缓冲流
 */
public class BufferedWriterReaderDemo {
	public static void main(String[] args) throws IOException {
		//字符缓冲流的输出
		BufferedWriter out = new BufferedWriter(new FileWriter("file/ch.txt"));
		out.write("君不见黄河之水天上来");
		out.newLine();
		out.write("奔流到还不复还");
		out.close();
		//字符缓冲流的输入
		BufferedReader bin = new BufferedReader(new FileReader("file/ch.txt"));
		/*char[] buffer = new char[1024]; //这里要用字符去接收
		int len = -1;
		while((len = bin.read(buffer)) > 0) {
			System.out.println(new String(buffer, 0, len));
		}*/
		String line = null;
		while((line = bin.readLine()) != null) {
			System.out.println(line);
		}
		bin.close();
	}
}
