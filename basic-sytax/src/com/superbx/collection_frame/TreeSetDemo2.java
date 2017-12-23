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
	
	//��д�ȽϹ���
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
		//����Person�������������Ȼ����
		Set<Person> set = new TreeSet<>();
		set.add(new Person("���Ŵ�ѩ", 100));
		set.add(new Person("Сٻ", 32));
		set.add(new Person("����", 33));
		set.add(new Person("���", 92));
		System.out.println(set);
		//����Person�������ֵĳ�������������
		Set<Person> set2 = new TreeSet<>(new NameComparator()); //����һ���Ƚ������ͻᰴ�ձȽ�������Ĺ���������
		set2.add(new Person("���Ŵ�ѩ", 100));
		set2.add(new Person("Сٻٻ", 32));
		set2.add(new Person("����", 33));
		set2.add(new Person("��", 92));
		System.out.println(set2);
	}
}

//���ֵıȽ���
class NameComparator implements Comparator<Person>{
	
	//��д�ȽϹ���
	public int compare(Person o1, Person o2) {
		if(o1.name.length() > o2.name.length()) {
			return 1;
		} else if (o1.name.length() < o2.name.length()){
			return -1;
		} else if (o1.equals(o2)) { //���ͬ���Ͱ���������
			if(o1.age > o2.age) {
				return 1;
			} else if(o1.age < o2.age) {
				return -1;
			}
			return 0;
		}
		return 0; //��Ϊͬһ������
	}
}