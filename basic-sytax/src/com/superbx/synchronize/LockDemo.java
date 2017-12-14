package com.superbx.synchronize;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Apple3 implements Runnable {
	private int num = 50; //ƻ���ܸ���
	private Lock lock = new ReentrantLock(); //����һ������
	
	public void run() {
		for (int i = 0;i < 50;i++) {
			eat();
		}
	}
	
	//��֤�����ż䰲ȫ���⣬���뷽���������
	private void eat(){
		//���뷽���ͼ���
		lock.lock();
		if (num > 0) {
			try {
				System.out.println(Thread.currentThread().getName() +" ���˱��Ϊ" + num + "��ƻ��");
				Thread.sleep(100);//ģ���ӳ�
				num--;			
			} catch (Exception e) {
			
			} finally {
				//�ͷ���
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
