package com.superbx.classinstance;

public class DataTypeClassInstanceDemo {
	public static void main(String[] args) {
		//8大基本数据类型Class实例
		Class booleanClass = boolean.class;
		Class intClass = int.class;
		
		//Integer.class和int.class相同嘛？答：不同
		System.out.println(Integer.class == int.class);
		System.out.println("----------------------------");
		/*
		 * 如何表示数组的class实例
		 * 方式一：数组类型.class;
		 * 方式二：数组对象.getClass();
		 * 
		 * 注意：所有的具有相同的维数和元素的类型的数组共享同一份字节码数组对象，和元素没有关系
		 */
		int[] arr1 = {1,2,3};
		Class arrClass = arr1.getClass();
		System.out.println(arrClass);
		Class arr2Class = int[].class;
		System.out.println(arrClass == arr2Class); //会比对两个字节码是不是同一个
	}
}
