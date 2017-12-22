package com.superbx.iterator;

import java.util.ArrayList;
import java.util.Iterator;

//for-each循环的demo
/*
 * 需求：
 * 		边迭代边删除元素
 */
public class ForeachDemo {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		/*for(Object ele : list) {
			System.out.println(ele);
			//删除集合中为B的字符串
			if("B".equals(ele)) {
				//会报 并发修改异常 的错误
				//list.remove(ele); 这里会报错，因为其底层又建了一个线程来处理迭代，删了其中一个，再迭代的时候两边数据不一样了，就会报错
				System.out.println(ele);
			}
		}*/
		
		Iterator it = list.iterator();
		while(it.hasNext()){
			Object ele = it.next();
			if("B".equals(ele)) {
				it.remove(); //该方法会将两个线程中的值都删除，保证了两个线程的同步
			}
		}
	}
}
