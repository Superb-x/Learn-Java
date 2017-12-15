

package com.superbx.producer_consumer_lock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//共享资源对象（姓名-性别）
public class ShareResource {
	private String name;
	private String gender;
	private boolean isEmpty = true; //表示共享资源对象是否为空
	private final Lock lock = new ReentrantLock();
	private Condition cond = lock.newCondition();
	
	/*
	 * Java5开始可以使用Lock的方式来取代同步方法和同步代码块
	 * 使用condition接口对象中的await，signal，signalA取代Object类中的wait，notify，notifyAll方法
	 */
	
	/**
	 * 用于生产者向共享资源对象中存储数据
	 * @param name 姓名
	 * @param gender 性别
	 */
	public void push(String name, String gender){		
		lock.lock();//获取锁
		try {
			while(!isEmpty) {
				cond.await();
			}
			//生产开始
			this.name = name;
			Thread.sleep(10);
			this.gender = gender;
			//生产结束
			cond.signalAll();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}
	
	/**
	 * 用于消费者从共享资源对象中取出对象
	 */
	public void popup(){
		lock.lock();
		try {
			while(isEmpty){ //当数据为空的时候，应该用condition.await()来改变状态
				cond.await();
			}
			//消费开始
			Thread.sleep(10);
			System.out.println(this.name + " - " + this.gender);
			//消费结束
			cond.signalAll();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}
}

