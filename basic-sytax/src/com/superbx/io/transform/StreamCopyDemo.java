package com.superbx.io.transform;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class StreamCopyDemo {
	public static void main(String[] args) throws IOException {
		//1������Դ
		File srcFile = new File("file/ch3.txt");
		File destFile = new File("file/ch3_copy.txt");
		//2����������������������󣨴����ܵ���
		Reader in = new InputStreamReader(new FileInputStream(srcFile), "GBK"); //�ǿ����໥ת����
		Writer out = new OutputStreamWriter(new FileOutputStream(destFile), "GBK"); //�����໥ת��
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
