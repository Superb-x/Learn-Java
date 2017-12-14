package com.superbx.thread;
//匿名内部类
public class AnonymousInnerClassDemo {
	public static void main(String[] args) {
		//主线程，运行游戏
		for (int i = 0;i < 50;i++) {
			System.out.println("正在打游戏" + i);
			if(i == 10) {
				//创建线程对象并启动
				Thread t = new Thread(new Runnable(){
					//使用匿名内部类来实现
					public void run() {
						for(int i = 0;i < 50;i++) {
							System.out.println("看片" + i);
						}
					}
					
				});
				t.start(); //启动线程要用start方法，会自动去运行run
			}
		}
	}
}
