package com.superbx.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

//���ն�
public class Receive {
	public static void main(String[] args) throws Exception {
		//�������Ͷ˶���
		DatagramSocket receive = new DatagramSocket(10086);
		byte[] buffer = new byte[1024];
		DatagramPacket dp = new DatagramPacket(buffer, 1024);
		receive.receive(dp);
		//��ȡ���յ�����
		String msg = new String(dp.getData());
		System.out.println(msg);
	}
}
