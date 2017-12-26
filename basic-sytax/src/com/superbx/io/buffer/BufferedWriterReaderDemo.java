package com.superbx.io.buffer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * �ַ�������
 */
public class BufferedWriterReaderDemo {
	public static void main(String[] args) throws IOException {
		//�ַ������������
		BufferedWriter out = new BufferedWriter(new FileWriter("file/ch.txt"));
		out.write("�������ƺ�֮ˮ������");
		out.newLine();
		out.write("��������������");
		out.close();
		//�ַ�������������
		BufferedReader bin = new BufferedReader(new FileReader("file/ch.txt"));
		/*char[] buffer = new char[1024]; //����Ҫ���ַ�ȥ����
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
