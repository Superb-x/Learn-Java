package com.superbx.collection_frame;

import java.util.Map;
import java.util.TreeMap;

/*
 * ����һ���ַ�����ÿһ���ַ������ֵĴ���
 */
public class MapDemo {
	public static void main(String[] args) {
		String str = "dhasdufgeubssbanxbhsaffiehfidjssdwsoxzlmmed";
		//���ַ���ת��Ϊchar���飬�ַ����ĵײ����char����
		char[] arr = str.toCharArray();
		//key�����洢�ַ�����value�����洢���ִ���
		Map<Character, Integer> map = new TreeMap<>();
		//ѭ���õ�ÿһ���ַ�
		for(char ch : arr) {
			//�жϵ�ǰ�ַ��Ƿ���Map��
			if(map.containsKey(ch)){
				//��ǰmap���ڸ��ַ�
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
