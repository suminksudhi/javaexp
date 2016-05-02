package com.example.stream;

import java.util.stream.IntStream;

public class ParallelDemo {

	public static void main(String[] args) {
		new ParallelDemo();
	}

	public ParallelDemo() {
		demoOne();
		demoTwo();
	}

	private void demoOne() {
		// IntStream.rangeClosed(1, 100).forEach((v) -> System.out.println(v) );
		IntStream.rangeClosed(1, 100).filter(v -> v < 50).forEach((v) -> System.out.println(v));
		System.out.println("=============================");
	}

	private void demoTwo() {
		IntStream.rangeClosed(1, 100).parallel().filter(v -> v < 50).forEach((v) -> {
			System.out.println(Thread.currentThread().getName());
			System.out.println(v);
		});
		System.out.println("=============================");
	}

}
