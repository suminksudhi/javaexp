package com.example.stream;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class StatsDemo {

	public static void main(String[] args) {
		new StatsDemo();
	}

	public StatsDemo() {
		demoTwo();
		demoOne();
	}

	
	private void demoTwo(){
		
		List<Integer> integers = Arrays.asList(23,5,4,23,98,7,5,43,65,34,78,5,23,45,9,87,54,23);
		//integers.stream().mapToInt(a->a*a).distinct().forEach(this::show);
		//integers.stream().limit(6).mapToInt(a->a*a).distinct().forEach(this::show);
		//integers.stream().skip(5).limit(6).mapToInt(a->a*a).distinct().forEach(this::show);
		System.out.println();
		System.out.println("===============================================");
	}


	
	private void demoOne(){
		
		List<Integer> integers = Arrays.asList(23,5,4,23,98,7,5,43,65,34,78,5,23,45,9,87,54,23);
		
		//IntSummaryStatistics statistics = integers.stream().mapToInt(a -> a).summaryStatistics();
		//IntSummaryStatistics statistics = integers.stream().mapToInt(a -> a*a).summaryStatistics();
		IntSummaryStatistics statistics = integers.stream().mapToInt(a -> a+10).summaryStatistics();

		System.out.println("Max Value : "+statistics.getMax());
		System.out.println("Min Value : "+statistics.getMin());
		System.out.println("Count Value : "+statistics.getCount());
		System.out.println("Avg Value : "+statistics.getAverage());
		System.out.println("Sum Value : "+statistics.getSum());

		
		System.out.println("===============================================");
	}
	
	public void show(int arg){
		System.out.printf(" %d , ",arg);
	}

	
}