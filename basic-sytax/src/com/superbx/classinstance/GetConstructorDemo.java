package com.superbx.classinstance;

import java.lang.reflect.Constructor;

class User{
	public User(){
		
	}
	public User(String name) {
		
	}
	private User(String name, int age){
		
	}
}

//��ȡ������
public class GetConstructorDemo {
	public static void main(String[] args) {
		getAll();
	}

	//��ȡ���еĹ�����
	private static void getAll() {
		//1����ȡ���������ڵ��ֽ������
		Class<User> cls = User.class;
		//2����ȡcls���������еĹ�����
		//public Constructor<?>[] getConstructor(); �÷���ֻ�ܻ�ȡ��ǰClass����ʾ���public���εĹ�����
		Constructor<?>[] cs = cls.getConstructors();
		System.out.println(cs.length);
		for(Constructor<?> c: cs){
			System.out.println(c);
		}
		System.out.println("=====================");
		cs.getClass().getDeclaredConstructors();
		for(Constructor<?> c: cs){
			System.out.println(c);
		}
	}
	
	//��ȡָ��������
	private static void getOne() throws NoSuchMethodException, SecurityException{
		//1����ȡ��������������ֽ������
		Class<User> cls = User.class;
		//2����ȡcls���������еĹ�����
		//����һ:��ȡpublic User������
		Constructor<User> con = cls.getConstructor();
		//���������ȡpublic User(String name)������
		con = cls.getConstructor(String.class); //��String.class����ȥ
		System.out.println(con);
		//����������ȡprivate User(String name, int age)������
		con.getClass().getDeclaredConstructor(String.class, int.class);
	}
}
