package com.superbx.collection_frame;

import java.util.ArrayDeque;
import java.util.Stack;

//ջdemo
public class StackDemo {
	public static void main(String[] args) {
		Stack s1 = new Stack();
		//s1.add(); //�������ڼ̳е����⣬������ʹ��ջ�ṹ��ʱ��Ҫȥ����
		s1.push("C");
		s1.push("B");
		s1.push("A");
		System.out.println(s1);
		System.out.println(s1.peek());
		s1.pop();
		System.out.println(s1);
		System.out.println("------------------------------------");
		ArrayDeque s2 = new ArrayDeque();
		s2.push("C");
		s2.push("B");
		s2.push("A");
		System.out.println(s2); //����ջ��������ˣ���ֻ�Ǹ��涨�����ؾ���
	}
}
