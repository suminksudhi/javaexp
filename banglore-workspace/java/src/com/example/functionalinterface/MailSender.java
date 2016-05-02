package com.example.functionalinterface;

public class MailSender {
	
	static long count = 0;
	
	public static void sender(String from, String to, String subject, String content,IMailService mailService){
		count++;
		mailService.sendMail(from,to,subject,content);
		System.out.println("Total mails sent : "+count);
	}
}
