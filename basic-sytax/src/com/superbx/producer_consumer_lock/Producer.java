package com.superbx.producer_consumer_lock;

public class Producer implements Runnable {
	
	
	//������Դ����
	private ShareResource resource = null;
	
	public Producer(ShareResource resource) {
		this.resource = resource;
	}
	
	public void run() {
		for(int i = 0;i < 50;i++) {
			if(i % 2 == 0) {
				resource.push("�����", "��");
			} else {
				resource.push("���", "Ů");
			}
		}
	}

}
