package com.superbx.network;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

/*
 * Java网络编程
 */
public class InetAddressDemo {
	public static void main(String[] args) throws Exception {
		InetAddress ip = InetAddress.getByName("DESKTOP-FML6HQB");
		//获取主机的IP地址
		System.out.println(ip.toString());//DESKTOP-FML6HQB/192.168.1.129
		//获取主机名称
		System.out.println(ip.getHostName());
		//获取IP地址
		System.out.println(ip.getHostAddress());
		//static InetAddress getLocalHost()  返回本机IP
		System.out.println(InetAddress.getLocalHost());
		//static 是否可达的,是否可以连接访问的
		System.out.println(InetAddress.getLocalHost().isReachable(1000)); //超时时间
	}
}
