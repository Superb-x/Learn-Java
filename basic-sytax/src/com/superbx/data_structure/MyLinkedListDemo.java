package com.superbx.data_structure;

public class MyLinkedListDemo {
	public static void main(String[] args) {
		MyLinkedList list = new MyLinkedList();
		list.addLast("A");
		list.addLast("B");
		list.addFirst("C");
		list.addFirst("D");
		list.addFirst("E");
		list.remove("C");
		System.out.println(list.toString());
	}
}
