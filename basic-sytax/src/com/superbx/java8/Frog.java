package com.superbx.java8;

import com.superbx.exception.IWalkable;

public class Frog extends BigMouth implements IAquaticAnimal, ITerrestrial {

	@Override
	public void run() {
		System.out.println("我只会跳");
	}

	@Override
	public void swim() {
		System.out.println("我只会蛙泳");
	}
	
	/*
	 * 如果两个接口中有方法签名相同的默认方法，那你只能自己来实现这个方法并指定方法
	 */
	public void breath(){
		IAquaticAnimal.super.breathInWater(); //指定父接口的实现
	}
	//多重集成的概念
	public static void main(String[] args) {
		Frog frog = new Frog();
		frog.run();
		frog.breathInLand();
		frog.breathInWater();
		frog.openMouth();
	}
}
