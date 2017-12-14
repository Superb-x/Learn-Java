package com.superbx.synchronize;

class Apple2 implements Runnable {
	private int num = 50; //ƻ���ܸ���
	
	public void run() { //��Ҫ��synchronized����run����������֮��ĳһ���߳̾Ͱѷ���ȫ��ִ������
		for (int i = 0;i < 50;i++) {
			eat();
		}
	}
	
	synchronized private void eat(){ //��synchronized���η�����
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

public class SynchronizedMethodDemo {
	public static void main(String[] args) {
		Apple2 a = new Apple2();//���̹߳������Դ
		new Thread(a, "A").start();
		new Thread(a, "B").start();
		new Thread(a, "C").start();
	}
}
