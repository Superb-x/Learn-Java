package com.superbx.collection_frame;

import java.util.Map;
import java.util.TreeMap;

/*
 * 计算一个字符串中每一个字符串出现的次数
 */
public class MapDemo {
	public static void main(String[] args) {
		String str = "dhasdufgeubssbanxbhsaffiehfidjssdwsoxzlmmed";
		//把字符串转换为char数组，字符串的底层就是char数组
		char[] arr = str.toCharArray();
		//key用来存储字符名，value用来存储出现次数
		Map<Character, Integer> map = new TreeMap<>();
		//循环得到每一个字符
		for(char ch : arr) {
			//判断当前字符是否在Map中
			if(map.containsKey(ch)){
				//当前map存在该字符
				Integer val = map.get(ch);
				val ++;
				map.put(ch, val);
			} else {
				map.put(ch, 1);
			}
		}
		System.out.println(map);
	}
}
