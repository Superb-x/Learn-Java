package com.superbx.load_resource;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

//������Դ�ļ�
public class LoadResourceDemo {
	public static void main(String[] args) throws Exception {
		test2();
	}
	//��ʽ1��ʹ�þ���·���ķ�ʽ����
	public static void test1() throws Exception{
		Properties p = new Properties();
		InputStream inStream = new FileInputStream("resource/db.properties");
		p.load(inStream);
		System.out.println(p);
	}
	//��ʽ2��ʹ�����·�������أ������classpath�ĸ�·��
	public static void test2() throws Exception{
		Properties p = new Properties();
		ClassLoader loader = Thread.currentThread().getContextClassLoader();
		InputStream inStream = loader.getResourceAsStream("db.properties");
		p.load(inStream);
		System.out.println(p);
	}
	//��ʽ3��ʹ�����·��-����ڵ�ǰ������Դ�ļ����ֽ���·��
	private static void test3() throws Exception{
		Properties p = new Properties();
		InputStream inStream = LoadResourceDemo.class.getResourceAsStream("db.properties");
		p.load(inStream);
		System.out.println(p);
	}
}
