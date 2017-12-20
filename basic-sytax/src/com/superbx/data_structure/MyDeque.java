package com.superbx.data_structure;

public class MyDeque extends MyLinkedList {
	public void removeFirst(){
		remove(this.first);
	}
	
	public void removeLast(){
		remove(this.last);
	}
	
	public void addFirst(){
		
	}
	
	public void addLast(){
		
	}
	
	public Object getFirst(){
		return this.first;
	}
	
	public Object getLast(){
		return this.last;
	}
	
	public static void main(String[] args) {
		MyDeque queue = new MyDeque();
		queue.addFirst("LYL");
		queue.addFirst("LXL");
		queue.addLast("LZL");
		System.out.println(queue);
	}
}
