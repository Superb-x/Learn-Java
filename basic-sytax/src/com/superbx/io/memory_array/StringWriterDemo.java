package com.superbx.io.memory_array;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

/*
 * �ַ����������
 */
public class StringWriterDemo {
	public static void main(String[] args) throws IOException {
		//�ַ����������
		StringWriter sWriter = new StringWriter();
		sWriter.write("�������ʮ����");
		sWriter.write("17��");
		
		System.out.println(sWriter.toString());
		
		//�ַ�����������
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
