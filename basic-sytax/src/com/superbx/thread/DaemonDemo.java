package com.superbx.thread;

class DaemonThread extends Thread {
	public void run(){
		for(int i = 0;i < 500;i++) {
			System.out.println(super.getName() + " - " + i);
		}
	}
}
//��̨�߳�,ǰ̨�߳̽���֮�󣬺�̨�߳�����ͻ����
public class DaemonDemo {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().isDaemon()); //ǰ̨�̴߳������߳�Ĭ����ǰ̨�߳�
		for(int i = 0;i < 50;i++) {
			System.out.println("main: " + i);
			if(i == 10) {
				DaemonThread t = new DaemonThread();
				t.setDaemon(true); //�������߳�Ϊ��̨����
 				t.start(); 
			}
		}
	}
}
