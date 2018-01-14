package com.superbx.classinstance;

import java.lang.reflect.Method;
import java.util.Arrays;

class Employee {
	public static void doWork1(int... arr){
		System.out.println("doWork1被调用" + Arrays.toString(arr));
	}
	public static void doWork2(String... arr){
		System.out.println("doWork2被调用" + Arrays.toString(arr));
	}
	public String sayHello(String name, int age){
		System.out.println("sayHello被调用");
		return name + ", " + age;
	}
}
public class MethodInvokeDemo2 {
	public static void main(String[] args) throws Exception {
		Class cls = Employee.class;
		//情况一：数组的元素类型是基本类型
		Method m = cls.getMethod("doWork1", int[].class);
		//m.invoke(null, 1,2,3,4,5) //ERROR
		m.invoke(null, new int[]{1,2,3,4,5});
		//情况二：数组的元素类型是引用类型
		m = cls.getMethod("doWork2", String[].class);
		System.out.println(m);
		//m.invoke(null, new String[]{"A", "B", "C", "D", "E"});//ERROR
		m.invoke(null, new Object[]{new String[]{"A", "B", "C", "D", "E"}});
		
		m = cls.getDeclaredMethod("sayHello", String.class, int.class);
		m.setAccessible(true); //设置私有方法的可访问属性
		Object o = m.invoke(cls.newInstance(), "Lucy", 18); //这里sayHello没有static修饰，表示属于实例的属性
		System.out.println(o);
	}
}
