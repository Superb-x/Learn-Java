package com.superbx.thread;

public class SleepDemo {
	public static void main(String[] args) {
		System.out.println("begining--------");
		for(int i = 5;i > 0;i--) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("ending-----------");
	}
}
