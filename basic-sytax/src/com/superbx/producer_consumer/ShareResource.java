package com.superbx.producer_consumer;

//共享资源对象（姓名-性别）
public class ShareResource {
	private String name;
	private String gender;
	private boolean isEmpty = true; //表示共享资源对象是否为空
	
	/**
	 * 用于生产者向共享资源对象中存储数据
	 * @param name 姓名
	 * @param gender 性别
	 */
	synchronized public void push(String name, String gender){		
		try {
			if(!isEmpty) { //当isEmpty为false的时候，等着消费者来获取
				//true的话就要生产
				this.wait();//使用同步锁对象来调用，表示当前线程释放同步锁，进入等待池中，只能被其他线程锁唤醒
			}
			//生产开始
			this.name = name;
			Thread.sleep(10);
			this.gender = gender;
			//生产结束
			isEmpty = false;//设置共享资源中数据不为空
			this.notifyAll();//唤醒一个消费者
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 用于消费者从共享资源对象中取出对象
	 */
	synchronized public void popup(){
		try {
			if(isEmpty) {//为true的时候，资源为空，等待生产者来生产
				//使用同步锁对象来调用，表示当前线程释放同步锁，进入等待池，只能被其他线程唤醒
				this.wait();
			}
			//消费开始
			Thread.sleep(10);
			System.out.println(this.name + " - " + this.gender);
			//消费结束
			isEmpty = true;
			this.notifyAll();//唤醒一个生产者
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}