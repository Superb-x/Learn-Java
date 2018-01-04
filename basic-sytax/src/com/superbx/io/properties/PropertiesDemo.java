package com.superbx.io.properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

//����properties�ļ�
public class PropertiesDemo {
	public static void main(String[] args) throws IOException {
		Properties p = new Properties();
		//�����������е�����
		InputStream in = new FileInputStream("resources/db.properties");
		p.load(in);
		
		System.out.println(p);
		System.out.println("�˺�:" + p.getProperty("username"));
		System.out.println("����:" + p.getProperty("password"));
	}
}
