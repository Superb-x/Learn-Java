package com.superbx.exception;

public class RegisterDemo {
	//模拟数据库中已经存在的账号
	private static String[] names = {"jack", "pony", "john"};
	public static void main(String[] args) {
		try {
			//可能出现异常的代码
			checkUsername("jack");
		} catch (Exception e) {
			//处理异常
			String errorMsg = e.getMessage();
			System.out.println("给用户看: " + errorMsg);
		}
	}
	
	public static boolean checkUsername(String username) {
		for (String name : names) {
			if (name.equals(username)) {
				throw new LogicException(username + "已经被注册了");
			}
		}
		return true;
	}
}
