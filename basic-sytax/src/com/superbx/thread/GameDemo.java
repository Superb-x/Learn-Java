package com.superbx.thread;

public class GameDemo {
	public static void main(String[] args) {
		System.out.println("����ʼ����");
		playGame();//����Ϸ
		playMusic();//��������
		System.out.println("�����������");
	}

	private static void playMusic() {
		for(int i = 0;i < 50;i++) {
			System.out.println("��������");
		}
	}

	private static void playGame() {
		for(int i = 0;i < 50;i++) {
			System.out.println("����Ϸ");
		}
	}
}
