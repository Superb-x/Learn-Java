package com.superbx.synchronize;

class Apple2 implements Runnable {
	private int num = 50; //苹果总个数
	
	public void run() { //不要用synchronized修饰run方法，修饰之后，某一个线程就把方法全部执行完了
		for (int i = 0;i < 50;i++) {
			eat();
		}
	}
	
	synchronized private void eat(){ //用synchronized修饰符修饰
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

public class SynchronizedMethodDemo {
	public static void main(String[] args) {
		Apple2 a = new Apple2();//多线程共享的资源
		new Thread(a, "A").start();
		new Thread(a, "B").start();
		new Thread(a, "C").start();
	}
}
