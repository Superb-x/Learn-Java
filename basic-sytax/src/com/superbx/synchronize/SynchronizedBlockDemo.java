package com.superbx.synchronize;

class Apple1 implements Runnable {
	private int num = 50; //ƻ���ܸ���
	
	public void run() {
		for (int i = 0;i < 50;i++) {
			synchronized (this) {//ͬ�������
				if (num > 0) {
					System.out.println(Thread.currentThread().getName() +" ���˱��Ϊ" + num + "��ƻ��");
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
		Apple1 a = new Apple1();//���̹߳������Դ
		new Thread(a, "A").start();
		new Thread(a, "B").start();
		new Thread(a, "C").start();
	}
}
