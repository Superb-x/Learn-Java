package com.superbx.synchronize;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Apple3 implements Runnable {
	private int num = 50; //苹果总个数
	private Lock lock = new ReentrantLock(); //创建一个对象
	
	public void run() {
		for (int i = 0;i < 50;i++) {
			eat();
		}
	}
	
	//保证厕所雅间安全问题，进入方法立马加锁
	private void eat(){
		//进入方法就加锁
		lock.lock();
		if (num > 0) {
			try {
				System.out.println(Thread.currentThread().getName() +" 吃了编号为" + num + "的苹果");
				Thread.sleep(100);//模拟延迟
				num--;			
			} catch (Exception e) {
			
			} finally {
				//释放锁
				lock.unlock();
			}
		}
	}
}

public class LockDemo {
	public static void main(String[] args) {
		Apple3 a = new Apple3();
		new Thread(a, "A").start();
		new Thread(a, "B").start();
		new Thread(a, "C").start();
	}
}
