package com.superbx.io;

import java.io.File;

/*
 * File类的目录操作
 */
public class DirDemo1 {
	public static void main(String[] args) {
		File dir = new File("D:/123/456/789");
		System.out.println(dir.isDirectory());
		System.out.println(dir.isFile());
		System.out.println(dir.exists()); //可以判断目录是否存在
		System.out.println("------------");
		//dir.mkdir(); //mkdir只能创建一级的目录，创建多级就要mkdirs方法	
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
