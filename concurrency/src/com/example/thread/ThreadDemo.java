package com.example.thread;

public class ThreadDemo {

	public static void main(String[] args) {

		new Thread(new TaskI()).start();
		new Thread(new TaskJ()).start();
	}

}

class TaskI implements Runnable {

	public void run() {

		for (int i = 1; i <= 20; i++) {
			System.out.printf("I : %d%n", i);
		}

	}
}


class TaskJ implements Runnable {

	public void run() {

		for (int j = 1; j <= 20; j++) {
			System.out.printf("J : %d%n", j);
		}

	}
}
