package com.superbx.exception;
/*
 * 演示异常
 */
public class Demo {
	public static void main(String[] args) {
		//Demo.main(args); // 递归调用的时候如果没有推出条件会出现栈溢出错误
		System.out.println("begin-----------");
		String[] str = null;
		System.out.println(str.length);
		System.out.println("ending----------");
	}
}
