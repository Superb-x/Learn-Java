package com.superbx.tcp;

import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) throws Exception {
		String data = "���������Է�û������������";
		//��������ˣ��ƶ��˿�8888
		ServerSocket server = new ServerSocket(8888);
		System.out.println("�����׼������....");
		//�������Ӹ÷���˵Ŀͻ��˶���
		boolean accept = true;
		while(accept){
			Socket client = server.accept();
			System.out.println("���ӹ����Ŀͻ���" + client.getInetAddress());
			
			PrintStream out = new PrintStream(client.getOutputStream());
			out.print(data);
			out.close();
		}
		server.close();
	}
}
