package com.superbx.exception;
//ʹ��try-catch���񵥸��쳣
public class SingleCatchDemo {
	public static void main(String[] args) {
		System.out.println("begin-------------");
		int ret = 0;
		try{
			ret = 10 / 0;
		} catch(ArithmeticException ex) {
			System.out.println("you can not / 0");
		}
		System.out.println("result=" + ret);
		System.out.println("ending");
	}
}
