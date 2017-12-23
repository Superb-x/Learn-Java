package com.superbx.collection_frame;

import java.util.LinkedHashSet;
import java.util.Set;

//使用哈希表和链表算法，保证了HashSet中元素的先后添加顺序

public class LinkedHashSetDemo {
	public static void main(String[] args) {
		Set<String> set = new LinkedHashSet(); //这样就能保证顺序
		set.add("X");
		set.add("C");
		set.add("B");
		set.add("1");
		set.add("2");
		System.out.println(set);
	}
}
