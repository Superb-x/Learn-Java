package com.superbx.io;

import java.io.File;

public class FileDemo2 {
	public static void main(String[] args) {
		//����һ��File����
		File f = new File("E:/abc/123.txt");
		System.out.println(f);
		System.out.println(f.length()); //�ļ������ڵĻ��ͻ᷵��0
	}
}
