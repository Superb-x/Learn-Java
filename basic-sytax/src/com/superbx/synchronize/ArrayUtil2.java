package com.superbx.synchronize;
//单例模式-懒汉式
public class ArrayUtil2 {
	private ArrayUtil2(){}
	private static volatile ArrayUtil2 instance = null; //单例设计模式这才是合理的
	
	//同步方法，此时的同步监听对象是(ArrayUtil2.class)
	public static ArrayUtil2 getInstance(){
		if(instance == null) {
			synchronized (ArrayUtil2.class) { //双重锁，尽量把synchronized作用域缩小一些
				if (instance == null){
					instance = new ArrayUtil2();												
				}
			}
		}
		return instance;
	}
	public void sort(int[] arr) {
		
	}
}
