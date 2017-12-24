package com.superbx.collection_frame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * 集合框架的Collections工具类
 * 常用的集合类
 * 
 * HashSet/ArrayList/HashMap都是线程不安全的，在多线程环境下不安全
 * 在Collections类中有获取线程安全的集合方法
 */
public class CollectionsDemo {
	public static void main(String[] args) {
		List<Object> list = Collections.EMPTY_LIST; //得到一个空集，这是个常量
		List<Object> list2 = Collections.emptyList();//方法
		List<Object> list3 = new ArrayList<>();
		System.out.println(list);
	}
}
