package com.superbx.io;

import java.io.File;

//��ѯϵͳ�ļ��ű�
public class SearchFileDemo {
	public static void main(String[] args) {
		File dir = new File("D:/123");
		search(dir);
	}
	
	public static void search(File file) {
		if(!file.isDirectory()) {
			return;
		}
		File[] files = file.listFiles();
		for (File f : files) {
			if(f.isDirectory()) {
				search(f);
			} else {
				System.out.println(f);
			}
		}
	}
}
