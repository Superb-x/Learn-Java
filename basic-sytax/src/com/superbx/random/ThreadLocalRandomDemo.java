package com.superbx.random;

import java.util.concurrent.ThreadLocalRandom;

public class ThreadLocalRandomDemo {
	public static void main(String[] args) {
		ThreadLocalRandom random = ThreadLocalRandom.current();
		System.out.println(random.nextInt(34, 145)); // ����34��145֮��������
	}
}
