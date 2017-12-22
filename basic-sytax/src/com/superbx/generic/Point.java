package com.superbx.generic;

//点对象
public class Point<T> { //具体什么类型由调用者来指定
	private T x;
	private T y;
	
	public void setX(T x) {
		this.x = x;
	}
	
	public T getX(){
		return x;
	}
	
	public void setY(T y) {
		this.y = y;
	}
	
	public T getY(){
		return y;
	}
	
}

//泛型有一个约定俗成的表达式，T、E、K、V
