package com.superbx.generic;

import java.util.ArrayList;
import java.util.List;

public class GenericTypeDemo {
	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<>();
	}
	
	//��ʱ�ķ��ͣ���������Number���ͻ�Number�������
	public static void doWork(List<? extends Number> list) {
		
	}
	//��ʱ�ķ��ͣ���������Number���ͻ���Number�ĸ���
	public static void doWork2(List<? super Number> list) {
		
	}
}
