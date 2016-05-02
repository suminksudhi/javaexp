package com.example.forkjoin;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;
import java.util.concurrent.TimeUnit;

public class ForkJoinDemo {

	public static void main(String[] args) {
		new ForkJoinDemo();
	}

	public ForkJoinDemo() {

		ForkJoinPool pool = new ForkJoinPool();
		FileCountTask fileCountTask = new FileCountTask(new File("C:\\Windows"));
		pool.execute(fileCountTask);
		
		do{

			System.out.println("Procressors Count --- "+pool.getParallelism());
			System.out.println("Thread Count --- "+pool.getPoolSize());
			System.out.println("Task Count --- "+pool.getQueuedTaskCount());
			System.out.println("Steal Count --- "+pool.getStealCount());
			System.out.println("========================================================");
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}while(!fileCountTask.isDone());
		

		System.out.println("File Count --- "+fileCountTask.join());

		pool.shutdown();
		
		//long startTime = System.nanoTime();
			//long result = pool.invoke(new FileCountTask(new File("C:\\Windows")));
			//long result = pool.invoke(new FileCountTask(new File("C:\\")));
		//System.out.printf("Total File Count :  %d and time taken : %s%n", result,TimeUnit.NANOSECONDS.toSeconds((System.nanoTime() - startTime)));
		
		// System.out.printf("Processors :
		// %d%n",Runtime.getRuntime().availableProcessors());
		// long result = pool.invoke(new BigTask());
		// System.out.println("Result : "+result);
	}
}

class FileCountTask extends RecursiveTask<Long> {

	long count = 0L;
	File file = null;
	List<FileCountTask> tasks = new ArrayList<>();

	public FileCountTask(File file) {
		if(file != null){
			this.file = file;
		}
	}

	protected Long compute() {
		
		if (file.isFile()) {
			return 1L;
		} else {
			File files[] = file.listFiles();
			if(files != null){
				for (File f : files) {
					FileCountTask subTask = new FileCountTask(f);
					subTask.fork();
					tasks.add(subTask);
				}
			}
		}

		for (FileCountTask subTask : tasks) {
			this.count = this.count + subTask.join();
		}

		return this.count;
	}

}

class BigTask extends RecursiveTask<Long> {

	protected Long compute() {
		return 420L;
	}

}