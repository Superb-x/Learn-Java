package com.superbx.producer_consumer_lock;

//���Դ���
public class App {
	public static void main(String[] args) {
		//���������ߺ������߹�ͬ����Դ����
		ShareResource resource = new ShareResource();
		
		//�����������߳�
		new Thread(new Producer(resource)).start();
		//�����������߳�
		new Thread(new Consumer(resource)).start();
	}
}
