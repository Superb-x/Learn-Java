package com.superbx.classinstance;

//��ȡ�����ֽ���
public class ClassInstanceDemo {
	public static void main(String[] args) throws ClassNotFoundException {
		//���󣺻�ȡjava.util.Date����ֽ������
		//��ʽһ��ʹ��class����
		Class<java.util.Date> cls = java.util.Date.class; //��ʾjava.util.Date��һ���ֽ���
		//��ʽ����ͨ�������getClass��������ȡ��getClass��Object�����еķ���
		java.util.Date date = new java.util.Date();
		Class<?> cls2 = date.getClass(); //��?������˼��ͨ���
		//��ʽ3��ͨ��Class���еľ�̬����forName(String className)
		Class<?> cls3 = Class.forName("java.util.Date");
		/*
		 * ͬһ�������ڴ���ֻ��һ���ֽ������
		 * Ҳ����˵cls == cls2 == cls3
		 */
		System.out.println(cls);
		System.out.println(cls2);
		System.out.println(cls3);
	}
}
