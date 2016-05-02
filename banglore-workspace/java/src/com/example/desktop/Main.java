package com.example.desktop;

import java.awt.Desktop;
import java.io.File;
import java.net.URI;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Desktop desktop = Desktop.getDesktop();
		if(desktop != null){
			//desktop.open(new File("C:/demos/hello.txt"));			
			//desktop.open(new File("C:/demos/hello.docx"));			
			//desktop.edit(new File("C:/demos/hello.txt"));
			//desktop.browse(new URI("C:/demos/hello.html"));
			//desktop.print(new File("C:/demos/hello.docx"));
			desktop.mail(new URI("mailto:hi2tyagi@yahoo.com"));
				
			
		}else{
			System.out.println("No Desktop support by the machine!");
		}
		
		
	}
}
