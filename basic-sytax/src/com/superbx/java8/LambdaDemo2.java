package com.superbx.java8;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class LambdaDemo2 {
	@Test
	public void test(){
		Integer[] is = new Integer[]{2,3,4,1,6,3,4,9,6};
		Arrays.sort(is, Integer::compare); //这种写法也是lambda表达式，方法引用的快捷方式
		System.out.println(Arrays.toString(is));
	}
	
	public int compare(int x, int y){
		return Integer.compare(x, y);
	}
	
	@Test
	public void test2(){
		Integer[] is = new Integer[]{2,3,4,1,6,3,4,9,6};
		Arrays.sort(is, this::compare); //这种写法也是lambda表达式，方法引用的快捷方式
		System.out.println(Arrays.toString(is));
	}
	
	@Test
	public void test3(){
		Integer[] is = new Integer[]{2,3,4,1,6,3,4,9,6};
		List<Integer> ls = Arrays.asList(2,3,4,1,6,3,4,9,6);
		ls.forEach(System.out::println);
		System.out.println(Arrays.toString(is));
	}
}
