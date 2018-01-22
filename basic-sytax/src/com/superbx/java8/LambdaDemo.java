package com.superbx.java8;

import java.util.Arrays;
import java.util.Comparator;

import org.junit.Test;

public class LambdaDemo {
	class User{
		public String name;
		public int score;
		
		public User(String name, int score){
			this.name = name;
			this.score = score;
		}

		@Override
		public String toString() {
			return "User [name=" + name + ", score=" + score + "]";
		}
	
	}
	@Test
	public void testOldUse(){
		User[] us = new User[]{new User("����", 90), new User("����", 88), new User("����", 99)};
		//��User���鰴��score����
		Arrays.sort(us, new Comparator<User>(){
			@Override
			public int compare(User o1, User o2) {
				return Integer.compare(o1.score, o2.score);
			}
		});
		System.out.println(Arrays.toString(us));
	}
	
	@Test
	public void testNewUse1(){
		User[] us = new User[]{new User("����", 90), new User("����", 88), new User("����", 99)};
		//��User���鰴��score����
		//�������ֻ��һ�У��ǿ���ɾ�������ŵ�
		Arrays.sort(us, (User o1, User o2) -> Integer.compare(o1.score, o2.score));
		System.out.println(Arrays.toString(us));
	}
	
	@Test
	public void testNewUse2(){
		User[] us = new User[]{new User("����", 90), new User("����", 88), new User("����", 99)};
		//��User���鰴��score����
		//�������ֻ��һ�У��ǿ���ɾ�������ŵ�
		Arrays.sort(us, (o1, o2) -> Integer.compare(o1.score, o2.score));
		System.out.println(Arrays.toString(us));
	}
	
	public void testOldUse2(){
		new Thread(new Runnable(){
			@Override
			public void run() {
				System.out.println("hello, lambda!");
			}
		}).start();
	}
	
	@Test
	public void testNewUse3(){
		new Thread(() -> System.out.println("hello, lambda!")).start();
	}
	
	public static void main(String[] args) {
		
	}
}
