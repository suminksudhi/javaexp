package com.example.functionalinterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerDemo {
	
	public static void main(String[] args) {
		new ConsumerDemo();
	}
	
	public ConsumerDemo() {
		demoOne();
	}
	
	private void demoOne(){
		
		Consumer consumer1 = (a)-> { System.out.println(a);};
		consumer1.accept(new String("Hello"));

		Consumer<String> consumer2 = (a)-> { System.out.println(a);};
		consumer2.accept(new String("Hello Mr."));

		Consumer<Integer> consumer3 = (a)-> { System.out.println(a*a);};
		consumer3.accept(new Integer(10));

		BiConsumer<Integer,Integer> consumer4 = (a,b)-> { System.out.println(a+b);};
		consumer4.accept(new Integer(10),new Integer(60));

	}

}