

package com.superbx.producer_consumer_lock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//������Դ��������-�Ա�
public class ShareResource {
	private String name;
	private String gender;
	private boolean isEmpty = true; //��ʾ������Դ�����Ƿ�Ϊ��
	private final Lock lock = new ReentrantLock();
	private Condition cond = lock.newCondition();
	
	/*
	 * Java5��ʼ����ʹ��Lock�ķ�ʽ��ȡ��ͬ��������ͬ�������
	 * ʹ��condition�ӿڶ����е�await��signal��signalAȡ��Object���е�wait��notify��notifyAll����
	 */
	
	/**
	 * ����������������Դ�����д洢����
	 * @param name ����
	 * @param gender �Ա�
	 */
	public void push(String name, String gender){		
		lock.lock();//��ȡ��
		try {
			while(!isEmpty) {
				cond.await();
			}
			//������ʼ
			this.name = name;
			Thread.sleep(10);
			this.gender = gender;
			//��������
			cond.signalAll();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}
	
	/**
	 * ���������ߴӹ�����Դ������ȡ������
	 */
	public void popup(){
		lock.lock();
		try {
			while(isEmpty){ //������Ϊ�յ�ʱ��Ӧ����condition.await()���ı�״̬
				cond.await();
			}
			//���ѿ�ʼ
			Thread.sleep(10);
			System.out.println(this.name + " - " + this.gender);
			//���ѽ���
			cond.signalAll();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}
}

