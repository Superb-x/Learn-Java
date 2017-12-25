package com.superbx.io;

import java.io.File;
import java.io.IOException;

public class FileDemo2 {
	public static void main(String[] args) throws IOException {
		//创建一个File对象
		File f = new File("D:/abc/123.txt");
		System.out.println(f);
		System.out.println(f.length()); //文件不存在的话就会返回0
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
		//创建临时文件
		File.createTempFile("abc", null, null);
	}
}
