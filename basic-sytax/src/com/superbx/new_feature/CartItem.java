package com.superbx.new_feature;

public class CartItem {
	private String name;
	private Integer price;
	private Integer num;
	
	public CartItem(String name, Integer price, Integer num) {
		super();
		this.name = name;
		this.price = price;
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public Integer getPrice() {
		return price;
	}

	public Integer getNum() {
		return num;
	}

	public String toString() {
		return "CartItem [name=" + name + ", price=" + price + ", num=" + num + "]";
	}
	public CartItem(){ //需要提供一个公共无参数构造器
		
	}
}
