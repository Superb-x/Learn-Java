package com.superbx.exception;
//throw�ؼ��ִ����쳣
public class ThrowDemo {
	public static void main(String[] args) {
		try {
			int ret = divide(10, 0);
			System.out.println(ret);
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
	}
	
	private static int divide(int num1, int num2) {
		System.out.println("begin-------");
		if (num2 == 0) {
			throw new ArithmeticException("��������Ϊ0");
		}
		try {
			int ret = num1 / num2;
			System.out.println("����ǣ� " + ret);
			return ret;
			
		} catch (Exception e) {
			e.printStackTrace();
		}		
		System.out.println("ending");
		return 0;
	}
}
