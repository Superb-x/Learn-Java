package com.superbx.core.lib;

// 字符串操作练习
public class StringExDemo {
	public static void main(String[] args) {
		test1();
		test2();
	}

	private static void test2() {
		String str = "hello";
		String f = str.substring(0, 1);
		f.toUpperCase(); // 会重新返回一个值，并不知直接引用再修改
		System.out.println(f.toUpperCase() + str.substring(1));
	}

	private static void test1() {
		String fileNames = "abc.java;hello.txt;hello.java;hello.class";
		// 以分号来分割字符串，获取没一个文件的名称和拓展名
		String[] names = fileNames.split(";");
		for(String name : names) {
			// 判断没一个字符是不是以hello开头
			if (name.startsWith("hello")) {
				int lastDot = name.lastIndexOf(".");
				System.out.println(name.substring(lastDot));
			}
		}
	}
	
}
