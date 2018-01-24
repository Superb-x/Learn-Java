package com.superbx.java8;

public interface IAquaticAnimal {
	
	void swim();
	
	static void count(){ //接口上的静态方法
		System.out.println("水生动物越来越少了");
	}
	
	default void breathInWater(){ //默认的方法
		System.out.println("brearh in water");
	};
}
