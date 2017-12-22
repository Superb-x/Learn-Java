package com.superbx.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/*
 * 集合元素的迭代遍历操作，
 * 迭代：把集合中的元素一个一个的遍历取出来
 */
@SuppressWarnings("all")
public class IteratorDemo {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		
		//for循环：
		for (int i = 0; i < list.size(); i++) {
			Object ele = list.get(i);
			System.out.println(ele);
		}
		System.out.println("-----------------------");
		//for-each循环
		for(Object ele : list) {
			System.out.println(ele);
		}
		System.out.println("----------------------------");
		//使用迭代器Iterator
		Iterator it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("----------------------------");
		//方式三：使用for循环来操作迭代器,这种方式比while循环要好些，循环完毕之后会释放资源
		for(Iterator it2 = list.iterator();it2.hasNext();) {
			System.out.println(it2.next());
		}
		System.out.println("----------------------------");
		//listIterator，双向的迭代器
		ListIterator lt = list.listIterator();
		lt.next();
		Object ele = lt.previous();
		System.out.println(ele);
	}
}
