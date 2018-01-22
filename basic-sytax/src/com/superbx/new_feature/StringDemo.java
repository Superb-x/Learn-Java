package com.superbx.new_feature;

public class StringDemo {
	public static void main(String[] args) {
		String ret = join("-", "A", "B", "C", "D", "E");
		System.out.println(ret);
		
		System.out.println(hasLength(null));
		System.out.println(hasLength(""));
		System.out.println(hasLength("  "));
	}
	public static boolean hasLength(String str) {
		return str != null && !"".equals(str.trim());
	}
	public static boolean isBlank(String str) {
		return !hasLength(str);
	}
	//����һ��������join�����ԶԴ��뷽�����ַ��������ƶ��ķָ��������ӣ����������Ӻõ��ַ���
	public static String join(String separator, String ... values){
		if(isBlank(separator)) {
			separator = ", ";
		}
		StringBuilder sBuilder = new StringBuilder(values.length * 2 - 1);
		for (int i = 0; i < values.length; i++) {
			sBuilder.append(values[i]);
			if(i != values.length - 1) {
				sBuilder.append(separator);	
			}
		}
		return sBuilder.toString();
	}
}
