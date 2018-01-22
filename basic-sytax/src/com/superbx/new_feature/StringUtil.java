package com.superbx.new_feature;

public class StringUtil {
	private StringUtil(){};//������˽�л�����
	public static boolean hasLength(String str) {
		return str != null && !"".equals(str.trim());
	}
	public static boolean isBlank(String str) {
		return !hasLength(str);
	}
}
