package com.superbx.io;

import java.io.File;

public class FileDemo2 {
	public static void main(String[] args) {
		//创建一个File对象
		File f = new File("E:/abc/123.txt");
		System.out.println(f);
		System.out.println(f.length()); //文件不存在的话就会返回0
	}
}
