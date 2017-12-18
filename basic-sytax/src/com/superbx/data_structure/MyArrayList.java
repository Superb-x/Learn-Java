package com.superbx.data_structure;

import java.util.Arrays;

public class MyArrayList {
	//存储场上球员的球衣号码
	public Object[] elements = null;
	//场上球员的个数
	public int size = 0;
	private static final int DEFAULT_INITIAL_CAPACITY = 10; 
	//创建新的数组
	public MyArrayList(int initialCapacity) {
		if(initialCapacity < 0) {
			throw new IllegalArgumentException("容量不能为负数");
		}
		elements = new Integer[initialCapacity];
	}
	//默认构造器，长度为10
	public MyArrayList(){
		this(DEFAULT_INITIAL_CAPACITY);
	}
	//保存新的元素
	public void add(Integer ele) {
		//判断和扩容
		if(size == elements.length) {
			Object[] temp = Arrays.copyOf(elements, elements.length * 2);
			elements = temp; //重新引用一下
		}
		elements[size] = ele;
		size++;
	}
	//查询指定位置的元素
	public Object get(int index) {
		if(index < 0 || index >= size) {
			throw new IllegalArgumentException("索引越界");
		}
		return elements[index];
	}
	//根据元素查询索引的位置
	public int getIndexOfPlayer(Integer ele){
		for(int i = 0;i < size;i++) {
			if(elements[i].equals(ele)) {
				return i;
			}
		}
		return -1;
	}
	//替换指定索引位置的值
	public void set(int index, Integer newele) {
		elements[index] = newele;
	}

	//删除指定位置的元素
	public void remove(int index) {
		if(index < 0 || index >= size) {
			throw new IllegalArgumentException("索引越界");
		}
		for(int i = index;i < size - 1;i++) {
			//index + 1位置移动到index位置
			elements[i] = elements[i + 1];
		}
		//把最后一个设置为null
		elements[size - 1] = null;
		size--; //打印的时候长度-1
	}
	//打印大小
	public int size(){
		return size;
	}
	
	//判断是否为空
	public boolean isEmpty(){
		return size == 0;
	}
	
	//清空
	public void clear(){
		elements = null;
	}
	
	public String print() {
		if(elements == null) {
			return "null";
		}
		if(size == 0) {
			return "[]";
		}
		StringBuilder sb = new StringBuilder(size * 2 + 1);//我这里只需要存储5个数据
		sb.append("[");
		for(int i = 0;i < size;i++) {
			sb.append(elements[i]);
			if(i != size - 1) {//判断是不是最后一个元素
				sb.append(",");
			} else {
				sb.append("]");				
			}
		}
		return sb.toString();
	}
}
