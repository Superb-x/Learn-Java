package com.superbx.thread;

class Join extends Thread {
	public void run(){
		for(int i = 0;i < 50;i++) {
			System.out.println("join: " + i);
		}
	}
}
//�����߳�
public class JoinDemo {
	public static void main(String[] args) {
		System.out.println("begin----------");
		Join joinThread = new Join(); //����join�߳�
		for(int i = 0;i < 50;i++) {
			System.out.println("main: " + i);
			if(i == 10) {
				//����join�߳�
				joinThread.start();
			}
			if(i == 20) {
				try {
					joinThread.join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}//ǿ�����и��߳�
			}
			
		}
	}
}
