package com.superbx.tcp;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

//ģ��ͻ���
public class Client {
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket client = new Socket("localhost", 8888);
		//��ȡ�ͻ��˵�����������
		Scanner sc = new Scanner(client.getInputStream());
		while(sc.hasNext()) {
			String line = sc.nextLine();
			System.out.println(line);
		}
		sc.close();
		client.close();
	}
}
