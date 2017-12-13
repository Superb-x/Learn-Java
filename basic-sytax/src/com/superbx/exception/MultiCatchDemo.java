package com.superbx.exception;
//捕获多个异常
public class MultiCatchDemo {
	public static void main(String[] args) {
		System.out.println("begin------------");
		String snum1 = "10";
		String snum2 = "2B";
		try {
			// 把String转换成int类型
			int num1 = Integer.parseInt(snum1);
			int num2 = Integer.parseInt(snum2);
			
			// 两个整数相除
			int ret = num1 / num2;
			System.out.println("结果 = " + ret);
		} catch (ArithmeticException e) {
			System.out.println("数学运算时，除数不能为0");
		} catch (NumberFormatException e) {
			System.out.println("数字类型解析出错");
		} finally {
			System.out.println("捕获结束");
		}
		try {
			
		} finally {
			// TODO: 最终必须执行的代码
		}
		System.out.println("ending----------------");
	}
}
