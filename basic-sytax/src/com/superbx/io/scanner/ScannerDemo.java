package com.superbx.io.scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

//ɨ������
public class ScannerDemo {
	public static void main(String[] args) throws IOException {
		//ɨ���ļ��е�����
		//Scanner sc = new Scanner(new File("file/stream2.txt"), "GBK");
		//ɨ��������������
		//Scanner sc = new Scanner(System.in);
		//�����ַ����е�����
		Scanner sc = new Scanner("��ð������ǲ����е�ɵ��");
		while(sc.hasNextLine()) {
			String line = sc.nextLine();
			System.out.println("ECHO:" + line);
		}
		sc.close();
	}
}
