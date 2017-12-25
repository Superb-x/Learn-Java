package com.superbx.io;

import java.io.File;

/*
 * File���Ŀ¼����
 */
public class DirDemo1 {
	public static void main(String[] args) {
		File dir = new File("D:/123/456/789");
		System.out.println(dir.isDirectory());
		System.out.println(dir.isFile());
		System.out.println(dir.exists()); //�����ж�Ŀ¼�Ƿ����
		System.out.println("------------");
		//dir.mkdir(); //mkdirֻ�ܴ���һ����Ŀ¼�������༶��Ҫmkdirs����	
		dir.mkdirs();
		String[] names = dir.list();
		for (String name : names) {
			System.out.println(name);
		}
		System.out.println("----------------");
		File[] files = dir.listFiles();
		for (File file : files) {
			System.out.println(file);
		}
	}
}
