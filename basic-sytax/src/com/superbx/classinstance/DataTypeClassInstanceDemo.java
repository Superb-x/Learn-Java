package com.superbx.classinstance;

public class DataTypeClassInstanceDemo {
	public static void main(String[] args) {
		//8�������������Classʵ��
		Class booleanClass = boolean.class;
		Class intClass = int.class;
		
		//Integer.class��int.class��ͬ��𣺲�ͬ
		System.out.println(Integer.class == int.class);
		System.out.println("----------------------------");
		/*
		 * ��α�ʾ�����classʵ��
		 * ��ʽһ����������.class;
		 * ��ʽ�����������.getClass();
		 * 
		 * ע�⣺���еľ�����ͬ��ά����Ԫ�ص����͵����鹲��ͬһ���ֽ���������󣬺�Ԫ��û�й�ϵ
		 */
		int[] arr1 = {1,2,3};
		Class arrClass = arr1.getClass();
		System.out.println(arrClass);
		Class arr2Class = int[].class;
		System.out.println(arrClass == arr2Class); //��ȶ������ֽ����ǲ���ͬһ��
	}
}
