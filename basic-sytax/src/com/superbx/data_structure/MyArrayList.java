package com.superbx.data_structure;

import java.util.Arrays;

public class MyArrayList {
	//�洢������Ա�����º���
	public Object[] elements = null;
	//������Ա�ĸ���
	public int size = 0;
	private static final int DEFAULT_INITIAL_CAPACITY = 10; 
	//�����µ�����
	public MyArrayList(int initialCapacity) {
		if(initialCapacity < 0) {
			throw new IllegalArgumentException("��������Ϊ����");
		}
		elements = new Integer[initialCapacity];
	}
	//Ĭ�Ϲ�����������Ϊ10
	public MyArrayList(){
		this(DEFAULT_INITIAL_CAPACITY);
	}
	//�����µ�Ԫ��
	public void add(Integer ele) {
		//�жϺ�����
		if(size == elements.length) {
			Object[] temp = Arrays.copyOf(elements, elements.length * 2);
			elements = temp; //��������һ��
		}
		elements[size] = ele;
		size++;
	}
	//��ѯָ��λ�õ�Ԫ��
	public Object get(int index) {
		if(index < 0 || index >= size) {
			throw new IllegalArgumentException("����Խ��");
		}
		return elements[index];
	}
	//����Ԫ�ز�ѯ������λ��
	public int getIndexOfPlayer(Integer ele){
		for(int i = 0;i < size;i++) {
			if(elements[i].equals(ele)) {
				return i;
			}
		}
		return -1;
	}
	//�滻ָ������λ�õ�ֵ
	public void set(int index, Integer newele) {
		elements[index] = newele;
	}

	//ɾ��ָ��λ�õ�Ԫ��
	public void remove(int index) {
		if(index < 0 || index >= size) {
			throw new IllegalArgumentException("����Խ��");
		}
		for(int i = index;i < size - 1;i++) {
			//index + 1λ���ƶ���indexλ��
			elements[i] = elements[i + 1];
		}
		//�����һ������Ϊnull
		elements[size - 1] = null;
		size--; //��ӡ��ʱ�򳤶�-1
	}
	//��ӡ��С
	public int size(){
		return size;
	}
	
	//�ж��Ƿ�Ϊ��
	public boolean isEmpty(){
		return size == 0;
	}
	
	//���
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
		StringBuilder sb = new StringBuilder(size * 2 + 1);//������ֻ��Ҫ�洢5������
		sb.append("[");
		for(int i = 0;i < size;i++) {
			sb.append(elements[i]);
			if(i != size - 1) {//�ж��ǲ������һ��Ԫ��
				sb.append(",");
			} else {
				sb.append("]");				
			}
		}
		return sb.toString();
	}
}
