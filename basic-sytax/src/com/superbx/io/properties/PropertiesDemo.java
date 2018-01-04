package com.superbx.io.properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

//加载properties文件
public class PropertiesDemo {
	public static void main(String[] args) throws IOException {
		Properties p = new Properties();
		//加载输入流中的数据
		InputStream in = new FileInputStream("resources/db.properties");
		p.load(in);
		
		System.out.println(p);
		System.out.println("账号:" + p.getProperty("username"));
		System.out.println("密码:" + p.getProperty("password"));
	}
}
