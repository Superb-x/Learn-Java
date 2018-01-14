package com.superbx.classinstance;

import java.lang.reflect.Method;
import java.util.Arrays;

class Employee {
	public static void doWork1(int... arr){
		System.out.println("doWork1������" + Arrays.toString(arr));
	}
	public static void doWork2(String... arr){
		System.out.println("doWork2������" + Arrays.toString(arr));
	}
	public String sayHello(String name, int age){
		System.out.println("sayHello������");
		return name + ", " + age;
	}
}
public class MethodInvokeDemo2 {
	public static void main(String[] args) throws Exception {
		Class cls = Employee.class;
		//���һ�������Ԫ�������ǻ�������
		Method m = cls.getMethod("doWork1", int[].class);
		//m.invoke(null, 1,2,3,4,5) //ERROR
		m.invoke(null, new int[]{1,2,3,4,5});
		//������������Ԫ����������������
		m = cls.getMethod("doWork2", String[].class);
		System.out.println(m);
		//m.invoke(null, new String[]{"A", "B", "C", "D", "E"});//ERROR
		m.invoke(null, new Object[]{new String[]{"A", "B", "C", "D", "E"}});
		
		m = cls.getDeclaredMethod("sayHello", String.class, int.class);
		m.setAccessible(true); //����˽�з����Ŀɷ�������
		Object o = m.invoke(cls.newInstance(), "Lucy", 18); //����sayHelloû��static���Σ���ʾ����ʵ��������
		System.out.println(o);
	}
}
