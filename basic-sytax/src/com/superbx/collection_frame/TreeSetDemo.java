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
		System.out.println(set); //�ᰴ��Ȼ����Ҳ����ASCII����е�����
		System.out.println(set.first());//����ķ�������ȥ���ĵ�����֪����
		System.out.println(set.headSet("A"));//[1, 2, 3]
	}
}
