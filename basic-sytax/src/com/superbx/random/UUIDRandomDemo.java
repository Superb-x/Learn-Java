package com.superbx.random;

import java.util.UUID;
/*
 * uuid: Universally Unique Identify  会根据MAC地址和当地时间生成，空间中就这一个值
 * 我们一般用来表示随机的唯一字符串,缺点就是太长了
 */
public class UUIDRandomDemo {
	public static void main(String[] args) {
		String uuid = UUID.randomUUID().toString();
		System.out.println(uuid);
	}
}
