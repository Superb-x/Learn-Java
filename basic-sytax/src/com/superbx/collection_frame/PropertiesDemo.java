package com.superbx.collection_frame;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

//map的实现类,Hashtable的子类
public class PropertiesDemo {
	public static void main(String[] args) {
		Properties p = new Properties();
		//本质还是个Hashtable，只是在存储点 时候尽量存储成字符串
		p.setProperty("name", "lxl");
		p.setProperty("age", "22");
		p.setProperty("username", "root");
		p.setProperty("password", "admin");
		
		//根据key获取value值
		String val = p.getProperty("username", "如果改key不存在时，在这里设置默认值就好了");
		System.out.println(val);
		System.out.println(p);
		
		//加载资源文件（IO）
		InputStream inputStream = null;
		try {
			p.load(inputStream);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/*
	 * .properties文件一般指的是属性文件，例如db.properties数据库属性文件
	 */
}
