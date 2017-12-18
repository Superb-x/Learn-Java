package com.superbx.data_structure;

import java.util.Arrays;

//安排篮球运动员上场的一个示例
public class BasketBallPlayerDemo {
	//存储场上球员的球衣号码
	private static Integer[] players = null;
	//场上球员的个数
	private static int size = 0;
	//1):初始容量为5线性列表，准备用来存储场上的5个秋衣号码
	public static void init(int initialCapacity) {
		if(initialCapacity < 0) {
			throw new IllegalArgumentException("容量不能为负数");
		}
		players = new Integer[initialCapacity];
	}
	//2):安排5个球员上场[11,22,33,44,55]
	public static void add(Integer playerNum) {
		//判断和扩容
		if(size == players.length) {
			Integer[] temp = Arrays.copyOf(players, players.length * 2);
			players = temp; //重新引用一下
		}
		players[size] = playerNum;
		size++;
	}
	//3):查询指定位置的球员球衣号码是多少，查询索引位置为2的球衣号码是33
	private static Integer get(int index) {
		if(index < 0 || index >= size) {
			throw new IllegalArgumentException("索引越界");
		}
		return players[index];
	}
	//4):根据球衣号码查询该球员在场上索引的位置，例如44号球员在场上的索引位置是3
	private static int getIndexOfPlayer(Integer playerNum){
		for(int i = 0;i < size;i++) {
			if(players[i].equals(playerNum)) {
				return i;
			}
		}
		return -1;
	}
	//5):替换场上索引位置为2的球员，替换之后该位置的球衣编号为333。333把33替换了
	public static void set(int index, Integer newPlayerNum) {
		players[index] = newPlayerNum;
	}
	//6):替换场上球衣号码为22的球员，替换之后为222
	public static void update(Integer oldPlayerNum, Integer newPlayerNum) {
		int index = getIndexOfPlayer(oldPlayerNum);
		set(index, newPlayerNum);
	}
	//7):把场上索引位置为2的球员罚下场（注意是罚下，没有补位）
	public static void delete(int index) {
		if(index < 0 || index >= size) {
			throw new IllegalArgumentException("索引越界");
		}
		for(int i = index;i < size - 1;i++) {
			//index + 1位置移动到index位置
			players[i] = players[i + 1];
		}
		//把最后一个设置为null
		players[size - 1] = null;
		size--; //打印的时候长度-1
	}
	//8):按照球员在场上的位置，打印出球衣号码，打印风格：[11,22,33,44,55]
	
	public static void print() {
		if(players == null) {
			System.out.println("null");
			return;
		}
		if(size == 0) {
			System.out.println("[]");
			return;
		}
		StringBuilder sb = new StringBuilder(size * 2 + 1);//我这里只需要存储5个数据
		sb.append("[");
		for(int i = 0;i < size;i++) {
			sb.append(players[i]);
			if(i != size - 1) {//判断是不是最后一个元素
				sb.append(",");
			} else {
				sb.append("]");				
			}
		}
		System.out.println(sb);
	}
	public static void main(String[] args) {
		//初始化容量为5的线性列表
		init(5);
		//安排5个球员上场
		add(11);
		add(22);
		add(33);
		add(44);
		add(55);
		System.out.println(get(3));
		update(22, 222);
		print();
		delete(3);
		print();
	}
}
