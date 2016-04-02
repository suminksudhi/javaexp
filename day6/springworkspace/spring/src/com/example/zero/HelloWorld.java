package com.example.zero;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class HelloWorld {

	@Value("${user.greet}")
	String greeting;

	public void sayHello(String name) {
		System.out.println(this.greeting+" "+name);
	}

}
