package com.superbx.collection_frame;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class Person implements Comparable<Person>{
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	//编写比较规则
	public int compareTo(Person other){
		if (this.age > other.age) {
			return 1;
		} else if(this.age < other.age) {
			return -1;
		}
		return 0;
	}
	
}

public class TreeSetDemo2 {
	public static void main(String[] args) {
		//按照Person对象的年龄做自然排序
		Set<Person> set = new TreeSet<>();
		set.add(new Person("西门吹雪", 100));
		set.add(new Person("小倩", 32));
		set.add(new Person("赵四", 33));
		set.add(new Person("蛤蛤", 92));
		System.out.println(set);
		//按照Person对象名字的长短来定制排序
		Set<Person> set2 = new TreeSet<>(new NameComparator()); //传入一个比较器，就会按照比较器定义的规则来排序
		set2.add(new Person("西门吹雪", 100));
		set2.add(new Person("小倩倩", 32));
		set2.add(new Person("赵四", 33));
		set2.add(new Person("蛤", 92));
		System.out.println(set2);
	}
}

//名字的比较器
class NameComparator implements Comparator<Person>{
	
	//编写比较规则
	public int compare(Person o1, Person o2) {
		if(o1.name.length() > o2.name.length()) {
			return 1;
		} else if (o1.name.length() < o2.name.length()){
			return -1;
		} else if (o1.equals(o2)) { //如果同名就按年龄排序
			if(o1.age > o2.age) {
				return 1;
			} else if(o1.age < o2.age) {
				return -1;
			}
			return 0;
		}
		return 0; //视为同一个对象
	}
}