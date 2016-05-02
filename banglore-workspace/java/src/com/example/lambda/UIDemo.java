package com.example.lambda;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class UIDemo {

	public static void main(String[] args) {
		new UIDemo();
	}
	
	public UIDemo() {
		//demoOne();
		demoTwo();
		demoThree();
	}

	//Java 8
	private void demoThree(){
		
		JFrame frame = new JFrame("Event listener using lambda");
		JButton button = new JButton("Life is COOL");
		button.addActionListener((e)->{ System.out.println("Missile is launched successfully...... target is your office!"); });
		frame.getContentPane().add(button);
		frame.setSize(500, 200);
		frame.setVisible(true);
	}

	
	private void demoTwo(){
		
		JFrame frame = new JFrame("Event listener without lambda");
		JButton button = new JButton("Life is COOL");
		button.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				System.out.println("Missile is launched successfully...... target is your home!");	
			}
		});
		frame.getContentPane().add(button);
		frame.setSize(500, 200);
		frame.setVisible(true);
	}

	
	private void demoOne(){
		
		JFrame frame = new JFrame("Event listener without lambda");
		JButton button = new JButton("Life is COOL");
		button.addActionListener(new ButtonListener());
		frame.getContentPane().add(button);
		frame.setSize(500, 200);
		frame.setVisible(true);
	}
}

class ButtonListener implements ActionListener{

	public void actionPerformed(ActionEvent e) {
		System.out.println("Missile is launched successfully...... target is your home!");	
	}
	
}
