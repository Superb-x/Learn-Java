package com.superbx.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

/*
 * ��ʾ�ļ��ֽ�������
 */
public class FileInputStreamDemo {
	public static void main(String[] args) throws IOException {
		//1������Դ����ˮ����
		File file = new File("stream.txt");
		//2�������ļ��ֽ����������󣬲�����Դ��
		FileInputStream input = new FileInputStream(file);
		//3����ȡ����
		/*
		 * int read() ��ȡһ���ֽڵ�����
		 * int read(byte[] b) ��ȡ����ֽڣ����洢������b�У������������λ��Ϊ0��λ�ÿ�ʼ�棬���ض�ȡ���ֽڵĳ���
		 * int raed(byte[] b, int off, int len) ��ȡ����ֽڣ����洢������b�У��������offλ�ÿ�ʼ�洢len���ֽڵ�����
		 */
		//int data = input.read(); //��ȡstream.txt�еĵ�һ���ֽ�
		byte[] buffer = new byte[5];//��ʱ���洢5���ֽ�
		//input.read(buffer); //����㲻��ȡ�Ļ����ͻ�Ĭ����ʾ��5��0
		//System.out.println(Arrays.toString(buffer));
		//��byte[]ת��Ϊ�ַ���
		//String str = new String(buffer);
		//System.out.println(str);
		//���ļ������е����ݶ���ȡ��������
		int len = -1;//��ʾ��ǰ��ȡ���ֽ����������Ϊ-1��ʾ��ȡ��ĩβ��
		while((len = input.read(buffer)) != -1) {
			String str = new String(buffer, 0, len);
			System.out.println(str);
		}
		//4���ر���Դ
		input.close();
	}
}
