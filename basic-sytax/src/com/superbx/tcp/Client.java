package com.superbx.tcp;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

//模拟客户端
public class Client {
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket client = new Socket("localhost", 8888);
		//获取客户端的输入流对象
		Scanner sc = new Scanner(client.getInputStream());
		while(sc.hasNext()) {
			String line = sc.nextLine();
			System.out.println(line);
		}
		sc.close();
		client.close();
	}
}
