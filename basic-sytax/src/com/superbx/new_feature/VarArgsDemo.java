package com.superbx.new_feature;

import java.util.ArrayList;

public class VarArgsDemo {
	public static void main(String[] args) {
		CartItem item1 = new CartItem("�ֻ�", 1000, 10);
		CartItem item2 = new CartItem("ƽ��", 2000, 20);
		CartItem item3 = new CartItem("�ʼǱ�����", 5000, 10);
		CartItem[] items = {item1, item2, item3};
		Double ret = getTotalPrice(items);
		System.out.println(ret);
	}
	//�ṩһ����������������Ʒ���ܼ۸�
	public static Double getTotalPrice(CartItem ... items) { //�ɱ����Ҫע����ǣ�һ������ֻ����һ���ɱ����������ֻ�������
		Double ret = 0.0;
		for(int i = 0;i < items.length;i++) {
			CartItem item = items[i];
			ret += item.getPrice() * item.getNum();
		}
		return ret;
	}
}
