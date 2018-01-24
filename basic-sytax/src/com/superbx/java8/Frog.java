package com.superbx.java8;

import com.superbx.exception.IWalkable;

public class Frog extends BigMouth implements IAquaticAnimal, ITerrestrial {

	@Override
	public void run() {
		System.out.println("��ֻ����");
	}

	@Override
	public void swim() {
		System.out.println("��ֻ����Ӿ");
	}
	
	/*
	 * ��������ӿ����з���ǩ����ͬ��Ĭ�Ϸ���������ֻ���Լ���ʵ�����������ָ������
	 */
	public void breath(){
		IAquaticAnimal.super.breathInWater(); //ָ�����ӿڵ�ʵ��
	}
	//���ؼ��ɵĸ���
	public static void main(String[] args) {
		Frog frog = new Frog();
		frog.run();
		frog.breathInLand();
		frog.breathInWater();
		frog.openMouth();
	}
}
