package com.superbx.io.random_access_file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

//��������ļ�
/*
 * �����ڶ��߳������Լ��ϵ�����
 */
public class RandomAccessFileDemo {
	public static void main(String[] args) throws Exception {
		File f = new File("file/raf.txt");
		//write(f);
		read(f);
	}

	private static void read(File f) throws IOException {
		RandomAccessFile raf = new RandomAccessFile(f, "r");
		System.out.println("�ļ�ָ��λ��: " + raf.getFilePointer());
		byte b = raf.readByte();
		System.out.println(b);
		System.out.println("�ļ�ָ��λ��: " + raf.getFilePointer());
		String str = raf.readUTF();
		System.out.println(str);
		System.out.println("�ļ�ָ��λ��: " + raf.getFilePointer());
		raf.seek(0); //�����ļ�ָ��Ϊ0
		raf.skipBytes(12);//�����ļ�ָ������12���ֽ�
		int i = raf.readInt();
		System.out.println(i);
		System.out.println("�ļ�ָ��λ��: " + raf.getFilePointer());
	}

	private static void write(File f) throws IOException {
		RandomAccessFile raf = new RandomAccessFile(f, "rw");
		
		raf.write(65); //1�ֽ�
		raf.writeUTF("������");//9�ֽ� ʹ�õ����޸�֮���UTF-8��ʹ��֮���������ֽڣ�������ÿ�����ֶ�һ���ֽ�
		raf.writeInt(30);//4�ֽ�
		
		raf.close();
	}
}
