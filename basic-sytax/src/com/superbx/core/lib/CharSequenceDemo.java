package com.superbx.core.lib;

// 分别使用String/StringBuilder/StringBuffer来拼接30000次字符串，对比各自损耗的时间

public class CharSequenceDemo {
	public static void main(String[] args) {
		//testString();
		testStringBuilder();
		testStringBuffer();
	}

	private static void testString() {
		long begin = System.currentTimeMillis();
		String str = "";
		for(int i = 0;i < 30000;i++) {
			str += i;
		}
		long end = System.currentTimeMillis();
		System.out.println(end - begin);
	}

	private static void testStringBuilder() {
		long begin = System.currentTimeMillis();
		StringBuilder sb = new StringBuilder("");
		for(int i = 0;i < 30000;i++) {
			sb.append(i);
		}
		long end = System.currentTimeMillis();
		System.out.println("builder" + (end - begin));
	}

	private static void testStringBuffer() {
		long begin = System.currentTimeMillis();
		StringBuffer sb1 = new StringBuffer("");
		for(int i = 0;i < 30000;i++) {
			sb1.append(i);
		}
		long end = System.currentTimeMillis();
		System.out.println(end - begin);
	}
}
