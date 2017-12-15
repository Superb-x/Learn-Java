package com.superbx.producer_consumer_lock;

public class Producer implements Runnable {
	
	
	//共享资源对象
	private ShareResource resource = null;
	
	public Producer(ShareResource resource) {
		this.resource = resource;
	}
	
	public void run() {
		for(int i = 0;i < 50;i++) {
			if(i % 2 == 0) {
				resource.push("春哥哥", "男");
			} else {
				resource.push("凤姐", "女");
			}
		}
	}

}
