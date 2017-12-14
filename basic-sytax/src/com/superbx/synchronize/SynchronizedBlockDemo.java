package com.superbx.synchronize;

class Apple1 implements Runnable {
	private int num = 50; //苹果总个数
	
	public void run() {
		for (int i = 0;i < 50;i++) {
			synchronized (this) {//同步代码块
				if (num > 0) {
					System.out.println(Thread.currentThread().getName() +" 吃了编号为" + num + "的苹果");
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					num--;
				}
			}
		}
	}
}

public class SynchronizedBlockDemo {
	public static void main(String[] args) {
		Apple1 a = new Apple1();//多线程共享的资源
		new Thread(a, "A").start();
		new Thread(a, "B").start();
		new Thread(a, "C").start();
	}
}
