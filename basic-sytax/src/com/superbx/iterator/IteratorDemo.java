package com.superbx.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/*
 * ����Ԫ�صĵ�������������
 * �������Ѽ����е�Ԫ��һ��һ���ı���ȡ����
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
		
		//forѭ����
		for (int i = 0; i < list.size(); i++) {
			Object ele = list.get(i);
			System.out.println(ele);
		}
		System.out.println("-----------------------");
		//for-eachѭ��
		for(Object ele : list) {
			System.out.println(ele);
		}
		System.out.println("----------------------------");
		//ʹ�õ�����Iterator
		Iterator it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("----------------------------");
		//��ʽ����ʹ��forѭ��������������,���ַ�ʽ��whileѭ��Ҫ��Щ��ѭ�����֮����ͷ���Դ
		for(Iterator it2 = list.iterator();it2.hasNext();) {
			System.out.println(it2.next());
		}
		System.out.println("----------------------------");
		//listIterator��˫��ĵ�����
		ListIterator lt = list.listIterator();
		lt.next();
		Object ele = lt.previous();
		System.out.println(ele);
	}
}
