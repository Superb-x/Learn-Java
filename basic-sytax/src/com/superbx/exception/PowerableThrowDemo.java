package com.superbx.exception;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

// java7��ǿ���쳣
public class PowerableThrowDemo {
	public static void main(String[] args) {
		try {
			doWork();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void doWork() throws FileNotFoundException { // java7�д����쳣���Ӿ�ϸ�ˣ�������ͳ��ʹ��exception�׳��쳣
		try {
			new FileOutputStream("");
		} catch (Exception e) {
			e.printStackTrace();
			throw e;// �׸�������
		}
	}
}
