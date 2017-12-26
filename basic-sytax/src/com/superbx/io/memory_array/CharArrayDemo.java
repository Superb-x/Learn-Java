package com.superbx.io.memory_array;

import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.IOException;

public class CharArrayDemo {
	public static void main(String[] args) throws IOException {
		// �ַ��ڴ������
		CharArrayWriter cw = new CharArrayWriter();
		cw.write("����������Ʋ�");
		char[] data = cw.toCharArray();
		// System.out.println(data);
		// �ַ��ڴ�������
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
