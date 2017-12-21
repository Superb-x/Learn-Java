package com.superbx.data_structure;

//ջ�ṹ������������ʵ��ջ�ṹ
public class MyStack extends MyArrayList {
	
	//ѹջ
	public void push(Object ele){
		super.add(ele);
	}
	
	//ɾ��ջ����Ԫ��
	public void pop(){
		int index = super.size() - 1;
		remove(index);
	}
	
	//��ѯջ��Ԫ��
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
