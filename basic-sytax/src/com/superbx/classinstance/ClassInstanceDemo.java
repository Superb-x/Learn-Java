package com.superbx.classinstance;

//获取对象字节码
public class ClassInstanceDemo {
	public static void main(String[] args) throws ClassNotFoundException {
		//需求：获取java.util.Date类的字节码对象
		//方式一：使用class属性
		Class<java.util.Date> cls = java.util.Date.class; //表示java.util.Date这一份字节码
		//方式二：通过对象的getClass方法来获取，getClass是Object对类中的方法
		java.util.Date date = new java.util.Date();
		Class<?> cls2 = date.getClass(); //“?”的意思是通配符
		//方式3：通过Class类中的静态方法forName(String className)
		Class<?> cls3 = Class.forName("java.util.Date");
		/*
		 * 同一个类在内存中只有一个字节码对象，
		 * 也就是说cls == cls2 == cls3
		 */
		System.out.println(cls);
		System.out.println(cls2);
		System.out.println(cls3);
	}
}
