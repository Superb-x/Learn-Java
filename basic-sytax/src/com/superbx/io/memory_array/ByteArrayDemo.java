package com.superbx.io.memory_array;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

/*
 * �ֽڵ�������/�ڴ���
 */
public class ByteArrayDemo {
	public static void main(String[] args) throws IOException {
		//�ֽ����������
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		bos.write("ABCDE".getBytes());
		//Ҫʹ�ô洢����ʱ����
		byte[] buffer = bos.toByteArray();
		
		//�ֽ��������������ڴ�->����
		ByteArrayInputStream bin = new ByteArrayInputStream(buffer);
		byte[] bys = new byte[5];
		int len = -1;
		while((len = bin.read(bys)) > 0) { 
			System.out.println(new String(bys, 0, len));
		}
		bin.close();
		bos.close();
	}
}
