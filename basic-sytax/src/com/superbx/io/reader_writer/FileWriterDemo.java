package com.superbx.io.reader_writer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/*
 * �ַ����������ʾ��
 */
public class FileWriterDemo {
	public static void main(String[] args) throws IOException {
		//1������Ŀ��
		File destFile = new File("file/ch2.txt");
		//2�������ַ����������
		Writer out = new FileWriter(destFile, false); //�Ƿ�׷��
		//3��д������
		/*
		 * void write(int c);����д��һ���ַ�
		 * void write(char[] cbuf); ����д������ַ�
		 * void write(char[], off, len); ��off��ʼ����д��len���ַ�
		 * void write(String str); ����д��һ���ַ���
		 */
		out.write("ABCDEFG");
		out.write("\n");
		out.write("Hello, java".toCharArray(), 3, 2);
		//4���ر�����һ��Ҫ�رգ�ϵͳ���ڹر�֮ǰ����flush����
		out.close();
	}
}
