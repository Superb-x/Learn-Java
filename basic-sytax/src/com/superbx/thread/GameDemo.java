package com.superbx.thread;

public class GameDemo {
	public static void main(String[] args) {
		System.out.println("程序开始运行");
		playGame();//打游戏
		playMusic();//播放音乐
		System.out.println("程序结束运行");
	}

	private static void playMusic() {
		for(int i = 0;i < 50;i++) {
			System.out.println("播放音乐");
		}
	}

	private static void playGame() {
		for(int i = 0;i < 50;i++) {
			System.out.println("打游戏");
		}
	}
}
