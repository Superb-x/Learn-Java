package com.superbx.collection_frame;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

//map��ʵ����,Hashtable������
public class PropertiesDemo {
	public static void main(String[] args) {
		Properties p = new Properties();
		//���ʻ��Ǹ�Hashtable��ֻ���ڴ洢�� ʱ�����洢���ַ���
		p.setProperty("name", "lxl");
		p.setProperty("age", "22");
		p.setProperty("username", "root");
		p.setProperty("password", "admin");
		
		//����key��ȡvalueֵ
		String val = p.getProperty("username", "�����key������ʱ������������Ĭ��ֵ�ͺ���");
		System.out.println(val);
		System.out.println(p);
		
		//������Դ�ļ���IO��
		InputStream inputStream = null;
		try {
			p.load(inputStream);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/*
	 * .properties�ļ�һ��ָ���������ļ�������db.properties���ݿ������ļ�
	 */
}
