package com.superbx.exception;
// finallyÓï¾ä
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
