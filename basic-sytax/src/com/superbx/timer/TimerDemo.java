package com.superbx.timer;

import java.util.Timer;
import java.util.TimerTask;

//java定时器
public class TimerDemo {
	public static void main(String[] args) {
		//需求：3秒之后打印
		System.out.println("begin-----------");
		Timer timer = new Timer(); //此构造器中可以传一个布尔值，表示是否为后台
		timer.schedule(new TimerTask(){
			public void run(){
				System.out.println("你好，我是定时器");
			}
		}, 3000, 1000);
		System.out.println("ending");
	}
}
