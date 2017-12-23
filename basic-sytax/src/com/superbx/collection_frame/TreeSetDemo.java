package com.superbx.collection_frame;

import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<String>();
		set.add("E");
		set.add("F");
		set.add("G");
		set.add("H");
		set.add("I");
		set.add("A");
		set.add("3");
		set.add("2");
		set.add("1");
		System.out.println(set); //会按自然排序，也就是ASCII码表中的数据
		System.out.println(set.first());//具体的方法可以去看文档，就知道了
		System.out.println(set.headSet("A"));//[1, 2, 3]
	}
}
