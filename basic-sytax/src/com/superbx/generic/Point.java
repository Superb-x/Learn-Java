package com.superbx.generic;

//�����
public class Point<T> { //����ʲô�����ɵ�������ָ��
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

//������һ��Լ���׳ɵı��ʽ��T��E��K��V
