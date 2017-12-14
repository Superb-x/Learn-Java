package com.superbx.synchronize;
//����ģʽ-����ʽ
public class ArrayUtil2 {
	private ArrayUtil2(){}
	private static volatile ArrayUtil2 instance = null; //�������ģʽ����Ǻ����
	
	//ͬ����������ʱ��ͬ������������(ArrayUtil2.class)
	public static ArrayUtil2 getInstance(){
		if(instance == null) {
			synchronized (ArrayUtil2.class) { //˫������������synchronized��������СһЩ
				if (instance == null){
					instance = new ArrayUtil2();												
				}
			}
		}
		return instance;
	}
	public void sort(int[] arr) {
		
	}
}
