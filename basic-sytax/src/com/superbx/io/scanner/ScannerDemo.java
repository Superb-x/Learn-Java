package com.superbx.io.scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

//扫描器类
public class ScannerDemo {
	public static void main(String[] args) throws IOException {
		//扫描文件中的数据
		//Scanner sc = new Scanner(new File("file/stream2.txt"), "GBK");
		//扫描键盘输入的数据
		//Scanner sc = new Scanner(System.in);
		//接收字符串中的数据
		Scanner sc = new Scanner("你好啊，你是不是有点傻啊");
		while(sc.hasNextLine()) {
			String line = sc.nextLine();
			System.out.println("ECHO:" + line);
		}
		sc.close();
	}
}
