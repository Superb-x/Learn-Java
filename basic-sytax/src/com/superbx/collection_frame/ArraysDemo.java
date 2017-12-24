package com.superbx.collection_frame;

import java.util.Arrays;
import java.util.List;


/*
 *集合框架的Arrays类
 */
public class ArraysDemo {
	//把数组转换为List对象
	public static void main(String[] args) {
		String[] arr = {"A", "B", "C", "D"};
		List<String> list = Arrays.asList(arr);
		//list.remove(0); 此时报错，不支持的操作异常，asList返回一个固定大小的列表，不能增加也不能删除，但是可以改
		list.set(0, "AA");
		System.out.println(list);
		
		//======================================
		//该方法会自动装箱
		List<Integer> list1 = Arrays.asList(1,2,3,4,5);
		//定义了int类型数组
		int[] arr2 = {1,2,3,4,5};
		//直接把数组当作是对象
		List<int[]> list2 = Arrays.asList(arr2);
	}
}
