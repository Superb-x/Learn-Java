package com.superbx.io;

import java.io.File;
import java.io.IOException;

public class FileDemo2 {
	public static void main(String[] args) throws IOException {
		//����һ��File����
		File f = new File("D:/abc/123.txt");
		System.out.println(f);
		System.out.println(f.length()); //�ļ������ڵĻ��ͻ᷵��0
		test3();
	}

	private static void test3() throws IOException {
		File dir = new File("D:/abc");
		File f = new File(dir, "123.txt");
		System.out.println(f.isFile());
		if(!f.exists()) {
			f.createNewFile();
		} else {
			//f.renameTo(new File(dir, "123.java"));
			f.deleteOnExit();
		}
		//������ʱ�ļ�
		File.createTempFile("abc", null, null);
	}
}
