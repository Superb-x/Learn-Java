package com.superbx.core.lib;

// StringBuilder��StringBuffer����ͬ���ķ���
public class StringBuilderDemo {
	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder(16);// �൱��new StringBuilder(16)
		sb1.append("A").append("B").append("C").append("D");
		System.out.println(sb1);		
		new StringBuilderDemo().ooxx().ooxx(); // ��ʽ���ã����������ص��Ƕ�����ʱ
		
		String str = "ABCDEFG";
		String sb2 = new StringBuilder(str).deleteCharAt(str.length() - 1).toString();
		System.out.println(sb2);
		System.out.println(new StringBuilder("ABCDEFG").reverse());
	}
	
	public StringBuilderDemo ooxx(){
		return this;
	}
}
