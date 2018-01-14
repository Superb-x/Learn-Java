package com.superbx.classinstance;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/*
 * ʹ�÷��䴴������
 */

class Person {
	public Person(){
		System.out.println("�޲���������");
	}
	public Person(String name) {
		System.out.println("������" + name);
	}
	private Person(String name, int age){
		System.out.println("������" + name + ", " + age);
	}
}

//ʹ�÷�����ù�����---->��������
public class CreateObjectDemo {
	public static void main(String[] args) throws Exception {
		//��ͳ��ʽ��������
		//new Person();
		//new Person("LXL");
		Class<Person> cls = Person.class;
		//����public Person()
		Constructor<Person> con = cls.getConstructor();
		//���ù�������newInstance�������������󣬲�����ʵ��
		con.newInstance(); //����ֱ�ӷ���
		System.out.println("--------------------");
		//����public Person(String name)
		con = cls.getConstructor(String.class);
		con.newInstance("liuxianglin");
		System.out.println("--------------------");
		//����private Person(String name, int age)
		//��ͳ��ʽ�ǵ��ò���˽�й�������
		con = cls.getDeclaredConstructor(String.class, int.class);
		//���õ�ǰ���������Է���
		con.setAccessible(true); //���ÿ��Է��ʵĽӿ�
		con.newInstance("liuxianglin", 22);
	}
}
