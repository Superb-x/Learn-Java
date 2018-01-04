package com.superbx.io.random_access_file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

//随机访问文件
/*
 * 常用于多线程下载以及断点下载
 */
public class RandomAccessFileDemo {
	public static void main(String[] args) throws Exception {
		File f = new File("file/raf.txt");
		//write(f);
		read(f);
	}

	private static void read(File f) throws IOException {
		RandomAccessFile raf = new RandomAccessFile(f, "r");
		System.out.println("文件指针位置: " + raf.getFilePointer());
		byte b = raf.readByte();
		System.out.println(b);
		System.out.println("文件指针位置: " + raf.getFilePointer());
		String str = raf.readUTF();
		System.out.println(str);
		System.out.println("文件指针位置: " + raf.getFilePointer());
		raf.seek(0); //设置文件指针为0
		raf.skipBytes(12);//设置文件指针跳过12个字节
		int i = raf.readInt();
		System.out.println(i);
		System.out.println("文件指针位置: " + raf.getFilePointer());
	}

	private static void write(File f) throws IOException {
		RandomAccessFile raf = new RandomAccessFile(f, "rw");
		
		raf.write(65); //1字节
		raf.writeUTF("渣渣辉");//9字节 使用的是修改之后的UTF-8，使用之后会多两个字节，并不是每个汉字多一个字节
		raf.writeInt(30);//4字节
		
		raf.close();
	}
}
