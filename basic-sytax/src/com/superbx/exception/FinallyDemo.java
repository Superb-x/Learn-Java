package com.superbx.exception;
// finally���
public class FinallyDemo {
	public static void main(String[] args) {
		int ret =  test2();
		System.out.println(ret);
	}
	
	private static int test2(){
		try {
			return 
					1;
		} finally {
			return 
					100;
		}
	}
}
