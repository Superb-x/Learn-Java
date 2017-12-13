package com.superbx.exception;

public class RegisterDemo {
	//ģ�����ݿ����Ѿ����ڵ��˺�
	private static String[] names = {"jack", "pony", "john"};
	public static void main(String[] args) {
		try {
			//���ܳ����쳣�Ĵ���
			checkUsername("jack");
		} catch (Exception e) {
			//�����쳣
			String errorMsg = e.getMessage();
			System.out.println("���û���: " + errorMsg);
		}
	}
	
	public static boolean checkUsername(String username) {
		for (String name : names) {
			if (name.equals(username)) {
				throw new LogicException(username + "�Ѿ���ע����");
			}
		}
		return true;
	}
}
