package com.superbx.new_feature;

import java.util.ArrayList;

public class VarArgsDemo {
	public static void main(String[] args) {
		CartItem item1 = new CartItem("手机", 1000, 10);
		CartItem item2 = new CartItem("平板", 2000, 20);
		CartItem item3 = new CartItem("笔记本电脑", 5000, 10);
		CartItem[] items = {item1, item2, item3};
		Double ret = getTotalPrice(items);
		System.out.println(ret);
	}
	//提供一个方法来求出多个商品的总价格
	public static Double getTotalPrice(CartItem ... items) { //可变参数要注意的是，一个函数只能有一个可变参数，并且只能在最后
		Double ret = 0.0;
		for(int i = 0;i < items.length;i++) {
			CartItem item = items[i];
			ret += item.getPrice() * item.getNum();
		}
		return ret;
	}
}
