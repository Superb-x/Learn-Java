package com.superbx.classinstance;

import java.lang.reflect.Method;

/*
 * 
 */
class Animal {
	public void run(){
		
	}
	public void run(String name){
		
	}
	public String run(String name, int age) {
		return name + ", " + age;
	}
}
public class MethodDemo {
	public static void main(String[] args) {
		
	}
	private static void getAll(){
		Class cls = Animal.class;
		Method[] ms = cls.getMethods();		
		System.out.println(ms.length);
		for (Method m : ms) {
			System.out.println(m);
		}
		System.out.println("-------------------");
		ms = cls.getDeclaredMethods();
		System.out.println(ms.length);
		for(Method m : ms) {
			System.out.println(m);
		}
	}
	private static void getOne() throws Exception {
		Class cls = Animal.class;
		//获取run()
		Method m = cls.getMethod("run");
		//获取run(String name)
		m = cls.getMethod("run", String.class);
		System.out.println(m);
		//获取run(string name, int age)
		m = cls.getMethod("run", String.class, int.class);
		System.out.println(m);
	}
}
