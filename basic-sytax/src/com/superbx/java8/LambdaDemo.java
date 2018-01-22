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
		User[] us = new User[]{new User("张三", 90), new User("李四", 88), new User("王五", 99)};
		//对User数组按照score排序
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
		User[] us = new User[]{new User("张三", 90), new User("李四", 88), new User("王五", 99)};
		//对User数组按照score排序
		//如果代码只有一行，是可以删掉花括号的
		Arrays.sort(us, (User o1, User o2) -> Integer.compare(o1.score, o2.score));
		System.out.println(Arrays.toString(us));
	}
	
	@Test
	public void testNewUse2(){
		User[] us = new User[]{new User("张三", 90), new User("李四", 88), new User("王五", 99)};
		//对User数组按照score排序
		//如果代码只有一行，是可以删掉花括号的
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
