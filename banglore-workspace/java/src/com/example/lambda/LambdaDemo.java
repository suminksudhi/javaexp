package com.example.lambda;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class LambdaDemo {

	public static void main(String[] args) {

		Consumer expr1 = (a) -> {
			System.out.println(a);
		};
		
		Consumer expr2 = (Object a) -> {
			System.out.println(a);
		};
		Consumer expr3 = (Object a) -> System.out.println(a);
		Consumer expr4 = (Object a) -> {
			System.out.println(a);
			System.out.println(a + "10");
		};

		BiConsumer<Integer, Integer> expr5 = (Integer i, Integer j) -> {
			System.out.println(i + j);
		};

		BiConsumer<Integer, Integer> expr6 = (i, j) -> {
			System.out.println(i + j);
		};
		
		Supplier expr7 = () -> {  return 10+20; };
		
		Supplier expr8 = () -> 10+20; 
		
		Consumer expr9 = a -> { System.out.println(a); };
		
	}

}
