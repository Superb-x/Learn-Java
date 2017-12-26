package com.superbx.io.memory_array;

import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.IOException;

public class CharArrayDemo {
	public static void main(String[] args) throws IOException {
		// 字符内存输出流
		CharArrayWriter cw = new CharArrayWriter();
		cw.write("天边最美的云彩");
		char[] data = cw.toCharArray();
		// System.out.println(data);
		// 字符内存输入流
		CharArrayReader cr = new CharArrayReader(data);
		char[] ch = new char[100];
		int len = -1;
		while ((len = cr.read(ch)) != -1) {
			System.out.println(new String(ch, 0, len));
		}
		cw.close();
		cr.close();
	}
}
