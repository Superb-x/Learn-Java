package com.superbx.iterator;

import java.util.ArrayList;
import java.util.Iterator;

//for-eachѭ����demo
/*
 * ����
 * 		�ߵ�����ɾ��Ԫ��
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
			//ɾ��������ΪB���ַ���
			if("B".equals(ele)) {
				//�ᱨ �����޸��쳣 �Ĵ���
				//list.remove(ele); ����ᱨ����Ϊ��ײ��ֽ���һ���߳������������ɾ������һ�����ٵ�����ʱ���������ݲ�һ���ˣ��ͻᱨ��
				System.out.println(ele);
			}
		}*/
		
		Iterator it = list.iterator();
		while(it.hasNext()){
			Object ele = it.next();
			if("B".equals(ele)) {
				it.remove(); //�÷����Ὣ�����߳��е�ֵ��ɾ������֤�������̵߳�ͬ��
			}
		}
	}
}
