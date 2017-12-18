package com.superbx.data_structure;

import java.util.Arrays;

//安排篮球运动员上场的一个示例
public class BasketBallPlayerDemo {
	
	public static void main(String[] args) {
		//初始化容量为5的线性列表
		PlayerList.init(5);
		//安排5个球员上场
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
