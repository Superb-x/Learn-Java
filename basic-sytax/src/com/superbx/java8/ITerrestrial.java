package com.superbx.java8;

//½������
public interface ITerrestrial {
	void run();
	
	default void breathInLand(){
		System.out.println("½�����ﶼ�ܺ���");
	}
}
