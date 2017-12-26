package com.superbx.io.reader_writer;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

/*
 * ʹ���ļ��ַ���ʵ���ļ��� ������ǰ�����ļ��������ı�
 */
public class FileCopyDemo {
	public static void main(String[] args) throws IOException {
		//1������Դ
		File srcFile = new File("file/ch3.txt");
		File destFile = new File("file/ch3_copy.txt");
		//2����������������������󣨴����ܵ���
		Reader in = new FileReader(srcFile);
		Writer out = new FileWriter(destFile);
		//3����ȡ����
		char[] buffer = new char[100]; //ÿ�ζ�ȡ1024���ַ�
		int len = -1;
		len = in.read(buffer);
		while(len > 0){
			out.write(buffer, 0, len);
			len = in.read(buffer);
		}
		//4���ر�Դ
		in.close();
		out.close();
	}
}
