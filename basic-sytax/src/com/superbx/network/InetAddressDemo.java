package com.superbx.network;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

/*
 * Java������
 */
public class InetAddressDemo {
	public static void main(String[] args) throws Exception {
		InetAddress ip = InetAddress.getByName("DESKTOP-FML6HQB");
		//��ȡ������IP��ַ
		System.out.println(ip.toString());//DESKTOP-FML6HQB/192.168.1.129
		//��ȡ��������
		System.out.println(ip.getHostName());
		//��ȡIP��ַ
		System.out.println(ip.getHostAddress());
		//static InetAddress getLocalHost()  ���ر���IP
		System.out.println(InetAddress.getLocalHost());
		//static �Ƿ�ɴ��,�Ƿ�������ӷ��ʵ�
		System.out.println(InetAddress.getLocalHost().isReachable(1000)); //��ʱʱ��
	}
}
