package com.superbx.collection_frame;

import java.util.HashSet;
import java.util.Set;

class Student{
	private int sn;
	private String name;
	private int age;
	
	public Student(int sn, String name, int age) {
		super();
		this.sn = sn;
		this.name = name;
		this.age = age;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + sn;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (sn != other.sn)
			return false;
		return true;
	}
	
	
}
/*
 * 需要覆盖hashCode和equals方法
 */
public class HashSetDemo {
	public static void main(String[] args) {
		Set set = new HashSet<>();
		set.add(new Student(1, "张三", 16));
		set.add(new Student(1, "张三", 16));
		set.add(new Student(2, "李四", 17));
		set.add(new Student(2, "李四", 17));
		System.out.println(set.size());
		System.out.println(set);
	}
}
