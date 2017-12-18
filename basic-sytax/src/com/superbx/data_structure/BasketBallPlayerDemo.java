package com.superbx.data_structure;

import java.util.Arrays;

//���������˶�Ա�ϳ���һ��ʾ��
public class BasketBallPlayerDemo {
	//�洢������Ա�����º���
	private static Integer[] players = null;
	//������Ա�ĸ���
	private static int size = 0;
	//1):��ʼ����Ϊ5�����б�׼�������洢���ϵ�5�����º���
	public static void init(int initialCapacity) {
		if(initialCapacity < 0) {
			throw new IllegalArgumentException("��������Ϊ����");
		}
		players = new Integer[initialCapacity];
	}
	//2):����5����Ա�ϳ�[11,22,33,44,55]
	public static void add(Integer playerNum) {
		//�жϺ�����
		if(size == players.length) {
			Integer[] temp = Arrays.copyOf(players, players.length * 2);
			players = temp; //��������һ��
		}
		players[size] = playerNum;
		size++;
	}
	//3):��ѯָ��λ�õ���Ա���º����Ƕ��٣���ѯ����λ��Ϊ2�����º�����33
	private static Integer get(int index) {
		if(index < 0 || index >= size) {
			throw new IllegalArgumentException("����Խ��");
		}
		return players[index];
	}
	//4):�������º����ѯ����Ա�ڳ���������λ�ã�����44����Ա�ڳ��ϵ�����λ����3
	private static int getIndexOfPlayer(Integer playerNum){
		for(int i = 0;i < size;i++) {
			if(players[i].equals(playerNum)) {
				return i;
			}
		}
		return -1;
	}
	//5):�滻��������λ��Ϊ2����Ա���滻֮���λ�õ����±��Ϊ333��333��33�滻��
	public static void set(int index, Integer newPlayerNum) {
		players[index] = newPlayerNum;
	}
	//6):�滻�������º���Ϊ22����Ա���滻֮��Ϊ222
	public static void update(Integer oldPlayerNum, Integer newPlayerNum) {
		int index = getIndexOfPlayer(oldPlayerNum);
		set(index, newPlayerNum);
	}
	//7):�ѳ�������λ��Ϊ2����Ա���³���ע���Ƿ��£�û�в�λ��
	public static void delete(int index) {
		if(index < 0 || index >= size) {
			throw new IllegalArgumentException("����Խ��");
		}
		for(int i = index;i < size - 1;i++) {
			//index + 1λ���ƶ���indexλ��
			players[i] = players[i + 1];
		}
		//�����һ������Ϊnull
		players[size - 1] = null;
		size--; //��ӡ��ʱ�򳤶�-1
	}
	//8):������Ա�ڳ��ϵ�λ�ã���ӡ�����º��룬��ӡ���[11,22,33,44,55]
	
	public static void print() {
		if(players == null) {
			System.out.println("null");
			return;
		}
		if(size == 0) {
			System.out.println("[]");
			return;
		}
		StringBuilder sb = new StringBuilder(size * 2 + 1);//������ֻ��Ҫ�洢5������
		sb.append("[");
		for(int i = 0;i < size;i++) {
			sb.append(players[i]);
			if(i != size - 1) {//�ж��ǲ������һ��Ԫ��
				sb.append(",");
			} else {
				sb.append("]");				
			}
		}
		System.out.println(sb);
	}
	public static void main(String[] args) {
		//��ʼ������Ϊ5�������б�
		init(5);
		//����5����Ա�ϳ�
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
