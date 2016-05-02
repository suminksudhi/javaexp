package com.example.forkjoin;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class SimpleDemo {

	public static void main(String[] args) {
		new SimpleDemo();
	}

	public SimpleDemo() {
		demoOne();
	}

	private void demoOne() {

		long startTime = System.nanoTime();
		//long result = fileCount(new File("C:\\Windows"));
		long result = fileCount(new File("C:\\"));
		System.out.printf("Total File Count :  %d and time taken : %s%n", result,TimeUnit.NANOSECONDS.toSeconds((System.nanoTime() - startTime)));

	}

	private long fileCount(File file) {
		long count = 0L;

		if (file.isFile()) {
			return 1L;
		} else {
			File files[] = file.listFiles();
			if (files != null) {
				for (File f : files) {
					count += fileCount(f);
				}
			}
		}
		return count;
	}
}
