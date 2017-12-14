package com.superbx.synchronize;

//单例模式-饿汉式
public class ArrayUtil {
	private ArrayUtil(){}
	private static ArrayUtil instance = new ArrayUtil();
	
	//存在线程方法不安全问题
	public static ArrayUtil getInstance(){
		return instance;
	}
	
	public void sort(int[] arr) {
		
	}
}
