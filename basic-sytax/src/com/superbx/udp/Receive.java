package com.superbx.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

//接收端
public class Receive {
	public static void main(String[] args) throws Exception {
		//创建发送端对象
		DatagramSocket receive = new DatagramSocket(10086);
		byte[] buffer = new byte[1024];
		DatagramPacket dp = new DatagramPacket(buffer, 1024);
		receive.receive(dp);
		//获取接收的数据
		String msg = new String(dp.getData());
		System.out.println(msg);
	}
}
