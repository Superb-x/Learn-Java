package com.superbx.classinstance;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/*
 * 使用反射创建对象
 */

class Person {
	public Person(){
		System.out.println("无参数构造器");
	}
	public Person(String name) {
		System.out.println("构造器" + name);
	}
	private Person(String name, int age){
		System.out.println("构造器" + name + ", " + age);
	}
}

//使用反射调用构造器---->创建对象
public class CreateObjectDemo {
	public static void main(String[] args) throws Exception {
		//传统方式创建对象
		//new Person();
		//new Person("LXL");
		Class<Person> cls = Person.class;
		//调用public Person()
		Constructor<Person> con = cls.getConstructor();
		//调用构造器的newInstance方法来创建对象，并传入实参
		con.newInstance(); //可以直接访问
		System.out.println("--------------------");
		//调用public Person(String name)
		con = cls.getConstructor(String.class);
		con.newInstance("liuxianglin");
		System.out.println("--------------------");
		//调用private Person(String name, int age)
		//传统方式是调用不到私有构造器的
		con = cls.getDeclaredConstructor(String.class, int.class);
		//设置当前构造器可以访问
		con.setAccessible(true); //设置可以访问的接口
		con.newInstance("liuxianglin", 22);
	}
}
