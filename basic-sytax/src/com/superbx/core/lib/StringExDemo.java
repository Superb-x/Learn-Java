package com.superbx.core.lib;

// �ַ���������ϰ
public class StringExDemo {
	public static void main(String[] args) {
		test1();
		test2();
	}

	private static void test2() {
		String str = "hello";
		String f = str.substring(0, 1);
		f.toUpperCase(); // �����·���һ��ֵ������ֱ֪���������޸�
		System.out.println(f.toUpperCase() + str.substring(1));
	}

	private static void test1() {
		String fileNames = "abc.java;hello.txt;hello.java;hello.class";
		// �Էֺ����ָ��ַ�������ȡûһ���ļ������ƺ���չ��
		String[] names = fileNames.split(";");
		for(String name : names) {
			// �ж�ûһ���ַ��ǲ�����hello��ͷ
			if (name.startsWith("hello")) {
				int lastDot = name.lastIndexOf(".");
				System.out.println(name.substring(lastDot));
			}
		}
	}
	
}
