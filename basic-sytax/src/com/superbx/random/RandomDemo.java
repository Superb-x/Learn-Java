package com.superbx.random;

import java.util.Random;
/*
 * Random()生成的是一个伪随机数
 */
public class RandomDemo {
	public static void main(String[] args) {
		Random r1 = new Random(10); //如果你传入一个种子的话，生成的结果将会是一样的
		System.out.println(r1.nextBoolean());
		System.out.println(r1.nextDouble());
		System.out.println(r1.nextInt());
		System.out.println(r1.nextInt(100));
	}
}
