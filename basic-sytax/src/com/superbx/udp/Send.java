package com.superbx.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Send {
	public static void main(String[] args) throws Exception {
		String data = "�ƺ�֮ˮ����������������������";
		//�������ն˶���
		DatagramSocket sender = new DatagramSocket(10010);
		//��������
		DatagramPacket dp = new DatagramPacket(
				data.getBytes(), //���͵�����
				data.length(), //���ݵĳ���
				InetAddress.getLocalHost(), //Ҫ���͵�������ַ
				10086); //�˿�
		sender.send(dp);
		sender.close();
	}
}
