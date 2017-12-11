package com.superbx.random;

import java.util.Random;
import java.util.UUID;

// 
public class RandomCodeDemo {
	public static void main(String[] args) {
		String code = UUID.randomUUID().toString().substring(0, 5);
		System.out.println(code);
		String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		str += str.toLowerCase();
		str += "0123456789";
		System.out.println(str);
		StringBuilder sb1 = new StringBuilder(4);
		for(int i = 0;i < 4;i++) {
			char ch = str.charAt(new Random().nextInt(str.length())); // 索引必须在[0, str.length() - 1)范围之内
			sb1.append(ch);
		}
		System.out.println(sb1);
	}
}
