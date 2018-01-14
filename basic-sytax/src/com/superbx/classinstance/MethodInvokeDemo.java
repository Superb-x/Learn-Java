package com.superbx.classinstance;

import java.lang.reflect.Method;

class Car {
	public void run(){
		System.out.println("Car.run()");
	}
	public void run(String name){
		System.out.println("Car.run()" + name);
	}
	private String sayHello(String name, int age) {
		System.out.println("Car.sayHello()" + name + ", " + age) ;
		return name + ", " + age;
	}
}
public class MethodInvokeDemo {
	public static void main(String[] args) throws Exception {
		//ʹ�÷�����÷���
		Class cls = Car.class;
		Method m = cls.getMethod("run");
		Object ret = m.invoke(cls.newInstance());
		//����public void run(String name)
		m = cls.getMethod("run", String.class);
		ret = m.invoke(cls.newInstance(), "Lucy");
		System.out.println(ret);
		//����private sayHello(String name, int age)
		m = cls.getDeclaredMethod("sayHello", String.class, int.class);
		//���ÿɷ���˽�г�Ա
		m.setAccessible(true);
		ret = m.invoke(cls.newInstance(), "Lucy", 22);
		System.out.println(ret);
		System.out.println("----------------------");
		Object obj = new java.util.Date();
		Method method = obj.getClass().getMethod("toLocaleString"); //��ȡ�����ֽ����еķ���
		Object d = method.invoke(obj);
		System.out.println(d);
	}
}
