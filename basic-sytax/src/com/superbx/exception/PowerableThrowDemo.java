package com.superbx.exception;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

// java7增强的异常
public class PowerableThrowDemo {
	public static void main(String[] args) {
		try {
			doWork();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void doWork() throws FileNotFoundException { // java7中处理异常更加精细了，不再笼统的使用exception抛出异常
		try {
			new FileOutputStream("");
		} catch (Exception e) {
			e.printStackTrace();
			throw e;// 抛给调用者
		}
	}
}
