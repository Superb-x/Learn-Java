package com.superbx.exception;
//throw关键字处理异常
public class ThrowsDemo {
	public static void main(String[] args) {
		try {
			int ret = divide(10, 0);
			System.out.println(ret);
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
	}
	
	//这种写法表示在本方法中不处理某种类型的异常，提醒调用者需要来处理该异常
	private static int divide(int num1, int num2) throws RuntimeException {
		System.out.println("begin-------");
		if (num2 == 0) {
			throw new RuntimeException("除数不能为0");
		}
		try {
			int ret = num1 / num2;
			System.out.println("结果是： " + ret);
			return ret;
			
		} catch (Exception e) {
			e.printStackTrace();
		}		
		System.out.println("ending");
		return 0;
	}
}
