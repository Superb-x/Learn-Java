package com.superbx.thread;

class DaemonThread extends Thread {
	public void run(){
		for(int i = 0;i < 500;i++) {
			System.out.println(super.getName() + " - " + i);
		}
	}
}
//后台线程,前台线程结束之后，后台线程立马就会结束
public class DaemonDemo {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().isDaemon()); //前台线程创建的线程默认是前台线程
		for(int i = 0;i < 50;i++) {
			System.out.println("main: " + i);
			if(i == 10) {
				DaemonThread t = new DaemonThread();
				t.setDaemon(true); //设置子线程为后台进程
 				t.start(); 
			}
		}
	}
}
