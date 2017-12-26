package com.superbx.io.reader_writer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/*
 * �ļ����ַ�������ʾ��
 */
public class FileReaderDemo {
	public static void main(String[] args) throws IOException {
		//1��������ָ��Դ
		File srcFile = new File("file/ch.txt");
		//2������������
		Reader in = new FileReader(srcFile);
		//3����ȡ����
		/*
		 * int read(); ÿ�ζ�ȡһ���ֽڣ���ȡ��ĩβ����-1
		 * int read(char[] buffer); ÿ�ζ�ȡ����ַ����Ѷ�ȡ���ַ��洢��buffer�����У���ȡ��ĩβ����-1
		 * 
		 */
		char[] buffer = new char[5]; //ÿ�ζ�ȡ5���ַ�
		int len = -1;
		while((len = in.read(buffer)) > 0) {
			System.out.println(buffer);
		}
		//4���ر���
		in.close();
	}
}
