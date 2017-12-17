package com.superbx.thread;

class PriorityThread extends Thread {
	public PriorityThread(String string) {
		super(string);
	}

	public void run() {
		for (int i = 0; i < 150; i++) {
			System.out.println(super.getName() + " - " + i);
		}
	}
}
//线程的优先级
/*
 * 优先级越高，执行的机会越多
 */
public class PriorityDemo {
	public static void main(String[] args) {
		//设置优先级
		PriorityThread min1 = new PriorityThread("A低优先级");
		min1.setPriority(Thread.MIN_PRIORITY);
		PriorityThread min2 = new PriorityThread("B低优先级");
		min2.setPriority(Thread.MIN_PRIORITY);
		PriorityThread min3 = new PriorityThread("C低优先级");
		min3.setPriority(Thread.MIN_PRIORITY);
		PriorityThread min4 = new PriorityThread("D低优先级");
		min4.setPriority(Thread.MIN_PRIORITY);
		
		
		PriorityThread max = new PriorityThread("最高优先级");
		max.setPriority(Thread.MAX_PRIORITY);
		PriorityThread nor = new PriorityThread("普通优先级");
		//设置主线程的优先级：
		Thread.currentThread().setPriority(10); //优先级的范围是0-10，普通的优先级是5，建议就使用这三个优先级，不要自定义
		System.out.println(Thread.currentThread().getPriority());
	}
}
