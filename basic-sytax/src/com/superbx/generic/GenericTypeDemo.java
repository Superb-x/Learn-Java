package com.superbx.generic;

import java.util.ArrayList;
import java.util.List;

public class GenericTypeDemo {
	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<>();
	}
	
	//此时的泛型？，必须是Number类型或Number类的子类
	public static void doWork(List<? extends Number> list) {
		
	}
	//此时的泛型？，必须是Number类型或者Number的父类
	public static void doWork2(List<? super Number> list) {
		
	}
}
