package com.superbx.collection_frame;

import java.util.ArrayDeque;
import java.util.Stack;

//栈demo
public class StackDemo {
	public static void main(String[] args) {
		Stack s1 = new Stack();
		//s1.add(); //这是由于继承的问题，我们在使用栈结构的时候不要去调用
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
		System.out.println(s2); //这里栈顶在左边了，这只是个规定，不必惊慌
	}
}
