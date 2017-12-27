package com.superbx.io.serializable;

import java.io.Serializable;

public class User implements Serializable {
	//解决反序列化时版本号冲突的问题就是将版本号定义成常量
	private static final long serialVersionUID = 1L;
	private String name;
	transient private String password; //当某一个参数不需要序列化的时候，用transient修饰符，表示瞬态的，就不会被序列化进去
	private int age;
	private String email;
	
	public User(String name, String password, int age) {
		super();
		this.name = name;
		this.password = password;
		this.age = age;
	}

	public String toString() {
		return "User [name=" + name + ", password=" + password + ", age=" + age
				+ "]";
	}
	
}
