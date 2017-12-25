package com.superbx.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * ʹ���ֽ�������ļ��Ŀ�������
 */
public class StringCopyDemo {
	public static void main(String[] args) throws IOException {
		//1������Դ
		File src = new File("stream.txt");
		File dest = new File("stream_copy.txt");
		//2����������Ĺܵ�
		FileInputStream in = new FileInputStream(src);
		FileOutputStream out = new FileOutputStream(dest);
		//3��ͨ�����������ж�ȡ����
		byte[] buffer = new byte[10]; //ͨ����1024�������Ǵ���һ������Ϊ10�Ļ�����
		int len = -1;//��ʾ�Ѿ���ȡ�˶��ٸ��ֽ����������-1�����ļ��Ѿ���ȡ�������
		while((len = in.read(buffer)) != -1) {
			//��ӡһ�£���ȡ������
			//System.out.println(new String(buffer, 0, len));
			//������buffer�����У��߶���д
			out.write(buffer, 0, len);
		}
		//4���رչܵ�
		in.close();
		out.close();
	}
}
