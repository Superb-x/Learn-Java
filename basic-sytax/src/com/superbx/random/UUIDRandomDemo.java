package com.superbx.random;

import java.util.UUID;
/*
 * uuid: Universally Unique Identify  �����MAC��ַ�͵���ʱ�����ɣ��ռ��о���һ��ֵ
 * ����һ��������ʾ�����Ψһ�ַ���,ȱ�����̫����
 */
public class UUIDRandomDemo {
	public static void main(String[] args) {
		String uuid = UUID.randomUUID().toString();
		System.out.println(uuid);
	}
}
