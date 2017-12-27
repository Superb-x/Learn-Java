package com.superbx.io.serializable;

import java.io.Serializable;

public class User implements Serializable {
	//��������л�ʱ�汾�ų�ͻ��������ǽ��汾�Ŷ���ɳ���
	private static final long serialVersionUID = 1L;
	private String name;
	transient private String password; //��ĳһ����������Ҫ���л���ʱ����transient���η�����ʾ˲̬�ģ��Ͳ��ᱻ���л���ȥ
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
