package com.superbx.tcp;

import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) throws Exception {
		String data = "你来啦，吃饭没，吃了再走呗";
		//创建服务端，制定端口8888
		ServerSocket server = new ServerSocket(8888);
		System.out.println("服务端准备就绪....");
		//接受连接该服务端的客户端对象
		boolean accept = true;
		while(accept){
			Socket client = server.accept();
			System.out.println("连接过来的客户端" + client.getInetAddress());
			
			PrintStream out = new PrintStream(client.getOutputStream());
			out.print(data);
			out.close();
		}
		server.close();
	}
}
