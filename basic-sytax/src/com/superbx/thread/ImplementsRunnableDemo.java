package com.superbx.thread;

//播放音乐的一个类
class MusicPlay implements java.lang.Runnable {

	public void run() {
		for (int i = 0;i < 50;i++) {
			System.out.println("播放音乐" + i);
		}
	}
	
}
public class ImplementsRunnableDemo {
	public static void main(String[] args) {
		//主线程，运行游戏
		for (int i = 0;i < 50;i++) {
			System.out.println("正在打游戏" + i);
			if(i == 10) {
				//创建线程对象并启动
				Runnable target = new MusicPlay();
				Thread t = new Thread(target);
				t.start(); //启动线程要用start方法，会自动去运行run
			}
		}
	}
}
