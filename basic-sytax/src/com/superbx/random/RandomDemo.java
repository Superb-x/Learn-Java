package com.superbx.random;

import java.util.Random;
/*
 * Random()���ɵ���һ��α�����
 */
public class RandomDemo {
	public static void main(String[] args) {
		Random r1 = new Random(10); //����㴫��һ�����ӵĻ������ɵĽ��������һ����
		System.out.println(r1.nextBoolean());
		System.out.println(r1.nextDouble());
		System.out.println(r1.nextInt());
		System.out.println(r1.nextInt(100));
	}
}
