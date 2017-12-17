package com.superbx.thread;

class Join extends Thread {
	public void run(){
		for(int i = 0;i < 50;i++) {
			System.out.println("join: " + i);
		}
	}
}
//联合线程
public class JoinDemo {
	public static void main(String[] args) {
		System.out.println("begin----------");
		Join joinThread = new Join(); //创建join线程
		for(int i = 0;i < 50;i++) {
			System.out.println("main: " + i);
			if(i == 10) {
				//启动join线程
				joinThread.start();
			}
			if(i == 20) {
				try {
					joinThread.join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}//强制运行该线程
			}
			
		}
	}
}
