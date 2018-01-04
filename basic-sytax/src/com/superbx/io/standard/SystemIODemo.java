package com.superbx.io.standard;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintStream;

public class SystemIODemo {
	public static void main(String[] args) throws IOException {
		// 重定向标准输入
		System.setIn(new FileInputStream("file/ch.txt"));
		//重定向标准输出流
		System.setOut(new PrintStream("file/xx.txt")); //此时输入流被打印到文件中
		System.out.println("begin----------------");
		int data = System.in.read();//接收键盘录入的一个字节		
		System.out.println(data);
		System.out.println("end------------------");
	}
}
