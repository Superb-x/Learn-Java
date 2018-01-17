package com.superbx.load_resource;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

//加载资源文件
public class LoadResourceDemo {
	public static void main(String[] args) throws Exception {
		test2();
	}
	//方式1：使用绝对路径的方式加载
	public static void test1() throws Exception{
		Properties p = new Properties();
		InputStream inStream = new FileInputStream("resource/db.properties");
		p.load(inStream);
		System.out.println(p);
	}
	//方式2：使用相对路径来加载，相对于classpath的根路径
	public static void test2() throws Exception{
		Properties p = new Properties();
		ClassLoader loader = Thread.currentThread().getContextClassLoader();
		InputStream inStream = loader.getResourceAsStream("db.properties");
		p.load(inStream);
		System.out.println(p);
	}
	//方式3：使用相对路径-相对于当前加载资源文件的字节码路径
	private static void test3() throws Exception{
		Properties p = new Properties();
		InputStream inStream = LoadResourceDemo.class.getResourceAsStream("db.properties");
		p.load(inStream);
		System.out.println(p);
	}
}
