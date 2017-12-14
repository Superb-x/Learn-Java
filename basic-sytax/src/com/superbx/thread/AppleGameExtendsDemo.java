package com.superbx.thread;

//每一个同学好比是一个线程对象
class Person extends Thread {
	private int num = 50; //苹果总个数
	Person (String name) {
		super(name);
	}
	public void run() {
		for (int i = 0;i < 50;i++) {
			if (num > 0) {
				System.out.println(super.getName() + " 吃了编号为" + num-- + "的苹果");
			}
		}
	}
}

//使用继承Thread方式来实现，三个同学吃苹果比赛
public class AppleGameExtendsDemo {
	public static void main(String[] args) {
		//创建三个线程（三个同学），吃苹果
		new Person("张老汉").start();
		new Person("张晓东").start();
		new Person("张大爷").start();
	}
}
