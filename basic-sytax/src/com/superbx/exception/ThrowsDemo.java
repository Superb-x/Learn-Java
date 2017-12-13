package com.superbx.exception;
//throw�ؼ��ִ����쳣
public class ThrowsDemo {
	public static void main(String[] args) {
		try {
			int ret = divide(10, 0);
			System.out.println(ret);
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
	}
	
	//����д����ʾ�ڱ������в�����ĳ�����͵��쳣�����ѵ�������Ҫ��������쳣
	private static int divide(int num1, int num2) throws RuntimeException {
		System.out.println("begin-------");
		if (num2 == 0) {
			throw new RuntimeException("��������Ϊ0");
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
