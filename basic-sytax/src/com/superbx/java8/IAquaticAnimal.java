package com.superbx.java8;

public interface IAquaticAnimal {
	
	void swim();
	
	static void count(){ //�ӿ��ϵľ�̬����
		System.out.println("ˮ������Խ��Խ����");
	}
	
	default void breathInWater(){ //Ĭ�ϵķ���
		System.out.println("brearh in water");
	};
}
