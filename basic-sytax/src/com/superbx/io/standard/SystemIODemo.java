package com.superbx.io.standard;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintStream;

public class SystemIODemo {
	public static void main(String[] args) throws IOException {
		// �ض����׼����
		System.setIn(new FileInputStream("file/ch.txt"));
		//�ض����׼�����
		System.setOut(new PrintStream("file/xx.txt")); //��ʱ����������ӡ���ļ���
		System.out.println("begin----------------");
		int data = System.in.read();//���ռ���¼���һ���ֽ�		
		System.out.println(data);
		System.out.println("end------------------");
	}
}
