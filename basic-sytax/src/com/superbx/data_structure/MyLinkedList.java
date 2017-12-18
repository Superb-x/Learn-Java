package com.superbx.data_structure;
//����˫�������һ������
public class MyLinkedList {
	
	private Node first;//����ĵ�һ���ڵ�
	private Node last; //��������һ���ڵ�
	private int size = 0; //�ڵ������
	
	public void addFirst(Object ele){
		Node node = new Node(ele);
		if(size == 0) {
			this.first = node;
			this.last = node;
		} else {
			node.next = this.first; //��֮ǰ��һ����Ϊ�����ڵ����һ���ڵ�
			this.first.prev = node; //�������ڵ���Ϊ֮ǰ�ڵ����һ���ڵ�
			this.first = node;      //�������ڵ���Ϊ��һ���ڵ�
		}
		size++;
	}
	
	public void addLast(Object ele) {
		Node node = new Node(ele);
		if(size == 0) {
			this.first = node;
			this.last = node;
		} else {
			this.last.next = node; //�������Ľڵ���Ϊ���һ������һ���ڵ�
			node.prev = this.last; //��֮ǰ���һ���ڵ���Ϊ�����ڵ����һ���ڵ�
			this.last = node;      //�������ڵ���Ϊ���һ���ڵ�
		}
		size++;
	}
	

	public void remove(Object ele){
		//�ҵ�Ҫ��ɾ���Ľڵ�
		Node current = this.first;
		for (int i = 0; i < size; i++) {
			if(!current.ele.equals(ele)){
				if(current.next == null) {
					return;
				}
				current = current.next;
			}
		}
		//ɾ���ڵ�
		if(current == first) {
			this.first = current.next;
			this.first.prev = null;
		} else if(current == last) {
			this.last = current.prev;
			this.last.next = null;
		} else {
			//��ɾ����ǰ�ڵ����һ����ֵ����ǰ�ڵ���һ����next
			current.prev.next = current.next;
			//��ɾ���ڵ����һ����ֵ����ǰ�ڵ���һ����prev
			current.next.prev = current.prev;
		}
		size--;
	}
	
	@Override
	public String toString() {
		if(size == 0) {
			return "[]";
		}
		StringBuilder sb = new StringBuilder(size * 2 + 1);
		Node current = this.first;//��һ���ڵ�
		sb.append("[");
		for (int i = 0; i < size; i++) {
			sb.append(current.ele);
			if(i != size - 1) {
				sb.append(",");
			} else {
				sb.append("]");
			}
			current = current.next; //ÿ��ѭ���꣬����һ���ڵ㸳����ǰ�ڵ�
		}
		return sb.toString();
	}
	
	//�����е�ÿһ���ڵ�
	class Node{
		Node prev; //��һ���ڵ����
		Node next; //��һ���ڵ����
		Object ele; //��ǰ�ڵ��ŵ�����
		
		public Node(Object ele) {
			this.ele = ele;
		}
	}
}
