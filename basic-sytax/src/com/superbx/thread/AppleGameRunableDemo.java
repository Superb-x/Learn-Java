package com.superbx.thread;
class Apple implements Runnable {
	private int num = 50; //ƻ���ܸ���
	
	public void run() {
		for (int i = 0;i < 50;i++) {
			if (num > 0) {
				System.out.println(Thread.currentThread().getName() +" ���˱��Ϊ" + num-- + "��ƻ��");
			}
		}
	}
}
//ʹ��runnable��ʽ��ʵ�֣�����ͬѧ��50��ƻ���ı���
public class AppleGameRunableDemo {
	public static void main(String[] args) {
		Apple a = new Apple();
		new Thread(a, "A").start();
		new Thread(a, "B").start();
		new Thread(a, "C").start();
	}
}
