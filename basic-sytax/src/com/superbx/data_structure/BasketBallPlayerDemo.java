package com.superbx.data_structure;

import java.util.Arrays;

//���������˶�Ա�ϳ���һ��ʾ��
public class BasketBallPlayerDemo {
	
	public static void main(String[] args) {
		//��ʼ������Ϊ5�������б�
		PlayerList.init(5);
		//����5����Ա�ϳ�
		PlayerList.add(11);
		PlayerList.add(22);
		PlayerList.add(33);
		PlayerList.add(44);
		PlayerList.add(55);
		System.out.println(PlayerList.get(3));
		PlayerList.update(22, 222);
		PlayerList.print();
		PlayerList.delete(3);
		PlayerList.print();
	}
}
