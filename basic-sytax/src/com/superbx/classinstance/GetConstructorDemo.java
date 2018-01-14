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

//获取构造器
public class GetConstructorDemo {
	public static void main(String[] args) {
		getAll();
	}

	//获取所有的构造器
	private static void getAll() {
		//1、获取构造器所在的字节码对象
		Class<User> cls = User.class;
		//2、获取cls对象中所有的构造器
		//public Constructor<?>[] getConstructor(); 该方法只能获取当前Class所表示类的public修饰的构造器
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
	
	//获取指定构造器
	private static void getOne() throws NoSuchMethodException, SecurityException{
		//1、获取构造器所在类的字节码对象
		Class<User> cls = User.class;
		//2、获取cls对象中所有的构造器
		//需求一:获取public User构造器
		Constructor<User> con = cls.getConstructor();
		//需求二：获取public User(String name)构造器
		con = cls.getConstructor(String.class); //将String.class传进去
		System.out.println(con);
		//需求三：获取private User(String name, int age)构造器
		con.getClass().getDeclaredConstructor(String.class, int.class);
	}
}
