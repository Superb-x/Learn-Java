package com.superbx.core.lib;
/*
 * java有一个常量池
 * 是编译优化的
 * 可以用反编译软件去查看
 */
public class StringConstantPool {
	public static String getXX(){
		return "AB";
	}
	public static void main(String[] args) {
		String str1 = "ABCD";
		String str2 = "AB" + "CD";
		String str3 = "A" + "B" + "C" + "D";
		String str4 = new String("ABCD");
		String temp = "AB";
		String str5 = temp + "CD";
		String str6 = getXX() + "CD";
		
		System.out.println(str1 == str2); //true
		System.out.println(str1 == str3); //true
		System.out.println(str1 == str4); //false
		System.out.println(str1 == str5); //false
		System.out.println(str1 == str6); //false
	}
}
