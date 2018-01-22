package com.superbx.new_feature;

public class StringUtil {
	private StringUtil(){};//构造器私有化起来
	public static boolean hasLength(String str) {
		return str != null && !"".equals(str.trim());
	}
	public static boolean isBlank(String str) {
		return !hasLength(str);
	}
}
