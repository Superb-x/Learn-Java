package com.superbx.collection_frame;

import java.util.Arrays;
import java.util.List;


/*
 *���Ͽ�ܵ�Arrays��
 */
public class ArraysDemo {
	//������ת��ΪList����
	public static void main(String[] args) {
		String[] arr = {"A", "B", "C", "D"};
		List<String> list = Arrays.asList(arr);
		//list.remove(0); ��ʱ������֧�ֵĲ����쳣��asList����һ���̶���С���б���������Ҳ����ɾ�������ǿ��Ը�
		list.set(0, "AA");
		System.out.println(list);
		
		//======================================
		//�÷������Զ�װ��
		List<Integer> list1 = Arrays.asList(1,2,3,4,5);
		//������int��������
		int[] arr2 = {1,2,3,4,5};
		//ֱ�Ӱ����鵱���Ƕ���
		List<int[]> list2 = Arrays.asList(arr2);
	}
}
