package com.superbx.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * ��ʾ�ļ��ֽ������
 */
public class FileOutputStreamDemo {
	public static void main(String[] args) throws IOException {
		//1������Ŀ����󣬱�ʾ�����ݱ��浽��һ���ļ�
		File target = new File("stream.txt"); //��ָ��Ŀ¼�ͻ�Ĭ�ϵ�ǰĿ¼
		//2�������ļ��ֽ����������ˮ�ܣ�
		FileOutputStream out = new FileOutputStream(target, false); //�Ƿ�׷������
		//3��������������(����д����)
		/*
		 * void write(int b) ��һ���ֽ�д���ļ���
		 * void write(byte[] b) ������b�����е��ֽڶ�д���ļ���ȥ
		 * void write(byte[] b, int off, int len) ������b�е����ݣ���off��ʼд��len���ȵ�����
		 */
		//out.write(65);д��A
		//out.write("ABCDE".getBytes());д��ABCDE
		out.write("liuxianglin will be java engineer".getBytes(), 10, 16);
		//4���ر���Դ����
		out.close();
	}
}
