package com.superbx.collection_frame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * ���Ͽ�ܵ�Collections������
 * ���õļ�����
 * 
 * HashSet/ArrayList/HashMap�����̲߳���ȫ�ģ��ڶ��̻߳����²���ȫ
 * ��Collections�����л�ȡ�̰߳�ȫ�ļ��Ϸ���
 */
public class CollectionsDemo {
	public static void main(String[] args) {
		List<Object> list = Collections.EMPTY_LIST; //�õ�һ���ռ������Ǹ�����
		List<Object> list2 = Collections.emptyList();//����
		List<Object> list3 = new ArrayList<>();
		System.out.println(list);
	}
}
