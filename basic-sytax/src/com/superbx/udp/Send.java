package com.superbx.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Send {
	public static void main(String[] args) throws Exception {
		String data = "黄河之水天上来，奔流到海不复还";
		//创建接收端对象
		DatagramSocket sender = new DatagramSocket(10010);
		//发送数据
		DatagramPacket dp = new DatagramPacket(
				data.getBytes(), //发送的数据
				data.length(), //数据的长度
				InetAddress.getLocalHost(), //要发送的主机地址
				10086); //端口
		sender.send(dp);
		sender.close();
	}
}
