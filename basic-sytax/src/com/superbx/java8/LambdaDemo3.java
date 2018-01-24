package com.superbx.java8;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class LambdaDemo3 {
	public <T> List<T> asList(IMyCreator<List<T>> creator, T...a){
		List<T> list = creator.create();
		for(T t : a) {
			list.add(t);
		}
		return list;
	}
	
	@Test
	public void test3(){
		//构造方法引用
		//类::new
		List<Integer> li = this.asList(ArrayList::new, 2,3,4,5,6);
		li.forEach(System.out::println);
		System.out.println(li.getClass());
	}
}
