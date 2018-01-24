package com.superbx.java8;

//陆生动物
public interface ITerrestrial {
	void run();
	
	default void breathInLand(){
		System.out.println("陆生动物都能呼吸");
	}
}
