package com.superbx.io.memory_array;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

/*
 * 字符串的输出流
 */
public class StringWriterDemo {
	public static void main(String[] args) throws IOException {
		//字符串的输出流
		StringWriter sWriter = new StringWriter();
		sWriter.write("龙哥今年十几岁");
		sWriter.write("17岁");
		
		System.out.println(sWriter.toString());
		
		//字符串的输入流
		StringReader sReader = new StringReader(sWriter.toString());
		char[] buffer = new char[1024];
		int len = 1;
		while((len = sReader.read(buffer)) > 0) {
			System.out.println(new String(buffer, 0, len));
		}
		sWriter.close();
		sReader.close();
	}
}
