package com.superbx.thread;
//播放音乐的线程类
class MusicThread extends java.lang.Thread {
	public void run() {
		for (int i = 0;i < 50;i++) {
			System.out.println("播放音乐" + i);
		}
	}
}
//线程示例
public class ExtendsThreadDemo {
	public static void main(String[] args) {
		//主线程，运行游戏
		for (int i = 0;i < 50;i++) {
			System.out.println("正在打游戏" + i);
			if(i == 10) {
				//创建线程对象并启动
				MusicThread t = new MusicThread();
				t.start(); //启动线程要用start方法，会自动去运行run
			}
		}
	}
}
