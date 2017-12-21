package com.superbx.data_structure;

//栈结构，基于数组来实现栈结构
public class MyStack extends MyArrayList {
	
	//压栈
	public void push(Object ele){
		super.add(ele);
	}
	
	//删除栈顶的元素
	public void pop(){
		int index = super.size() - 1;
		remove(index);
	}
	
	//查询栈顶元素
	public Object peek(){
		int index = super.size() - 1;
		return get(index);
	}
	
	public static void main(String[] args) {
		MyStack stack = new MyStack();
		stack.push("A");
		stack.push("B");
		stack.push("C");
		stack.push("D");
		stack.push("E");
		System.out.println(stack);
		System.out.println(stack.peek());
		stack.pop();
		System.out.println(stack);
	}
}
