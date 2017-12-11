package com.superbx.core.lib;

// StringBuilder和StringBuffer都是同样的方法
public class StringBuilderDemo {
	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder(16);// 相当于new StringBuilder(16)
		sb1.append("A").append("B").append("C").append("D");
		System.out.println(sb1);		
		new StringBuilderDemo().ooxx().ooxx(); // 链式调用，当方法返回的是对象本身时
		
		String str = "ABCDEFG";
		String sb2 = new StringBuilder(str).deleteCharAt(str.length() - 1).toString();
		System.out.println(sb2);
		System.out.println(new StringBuilder("ABCDEFG").reverse());
	}
	
	public StringBuilderDemo ooxx(){
		return this;
	}
}
