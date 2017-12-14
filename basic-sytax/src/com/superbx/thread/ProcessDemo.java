package com.superbx.thread;

import java.io.IOException;

//在Java中如何开启一个进程：运行记事本程序
public class ProcessDemo {
	public static void main(String[] args) throws IOException {
		//方式一：使用Runtime类的exec方法
		Runtime runtime = Runtime.getRuntime();
		runtime.exec("notepad");
		//方式二:使用processBuilder来创建，1.5之后的方法
		ProcessBuilder pb = new ProcessBuilder("notepad");
		pb.start();
	}
}
