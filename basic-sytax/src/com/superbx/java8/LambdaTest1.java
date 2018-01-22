package com.superbx.java8;

import org.junit.Test;

public class LambdaTest1 {
	public void wrapWork(IMyWork work){
		System.out.println("do some wrap work");
		work.doWork();
	}
	
	@Test
	public void test(){
		this.wrapWork(()->{
			System.out.println("do real work");
		});
	}
}
