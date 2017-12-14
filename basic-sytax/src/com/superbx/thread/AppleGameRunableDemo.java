package com.superbx.thread;
class Apple implements Runnable {
	private int num = 50; //苹果总个数
	
	public void run() {
		for (int i = 0;i < 50;i++) {
			if (num > 0) {
				System.out.println(Thread.currentThread().getName() +" 吃了编号为" + num-- + "的苹果");
			}
		}
	}
}
//使用runnable方式来实现，三个同学吃50个苹果的比赛
public class AppleGameRunableDemo {
	public static void main(String[] args) {
		Apple a = new Apple();
		new Thread(a, "A").start();
		new Thread(a, "B").start();
		new Thread(a, "C").start();
	}
}
