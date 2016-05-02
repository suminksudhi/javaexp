package com.example.base64;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class Main {

	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		demoOne();
	}
	
	private void demoOne(){
		
		String password = "secret";
		Encoder encoder = Base64.getEncoder();
		String encodedString = encoder.encodeToString(password.getBytes());
		System.out.println(encodedString);
	
		Decoder decoder = Base64.getDecoder();
		String original = new String(decoder.decode(encodedString));
		System.out.println(original);

	}
}
