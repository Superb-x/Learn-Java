package com.superbx.generic;

import java.awt.List;
import java.util.ArrayList;

public class Why {
	public static void main(String[] args) {
		 ArrayList list = new ArrayList();
		 list.add(1);
		 
		 Object ele = list.get(0);
		 //������Ҫ����Integer���еķ���
		 Integer num = (Integer)ele;
		 System.out.println(num);
	}
}
