package com.superbx.regex;
// 案例: 判断一个字符串全部由数字组成
public class RegexDemo {
	public static void main(String[] args) {
		String input = "123456";
		System.out.println(isNumber(input));
		System.out.println("123456".matches("\\d+"));
		String tel = "18932463349a";
		String reg = "^1[3|4|5|7|8|9]\\d{9}$"; // 正则表达式都差不多
		System.out.println(tel.matches(reg));
	}
	
	public static boolean isNumber(String str) {
		char[] arr = str.toCharArray(); // 如果不用正则的话，就要用这种比较low的方法
		for(char c : arr) {
			if (c < '0' || c > '9') {
				return false;
			}
		}
		return true;
	}
	
	public static boolean isNum(String str) {
		return str.matches("\\d+");
	}
}
