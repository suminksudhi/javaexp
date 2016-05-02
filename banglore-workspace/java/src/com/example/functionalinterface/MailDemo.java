package com.example.functionalinterface;

public class MailDemo {
	
	public static void main(String[] args) {
		new MailDemo();		
	}
	public MailDemo() {
		demoThree();
		demoTwo();
		demoOne();
	}
	
	private void demoThree(){
		MailSender.sender("PM Modi", "Obama", "Dost", "We are best friends.", (from,to,subject,content) -> System.out.printf("%s has sent mail to %s with subject as %s and content is ' %s '!%n",from,to,subject,content));
		MailSender.sender("PM Modi", "Obama", "Dost", "We are best friends.", (from,to,subject,content) -> System.out.printf("%s has sent mail to %s with subject as %s and content is ' %s '!%n",from,to,subject,content));
		MailSender.sender("PM Modi", "Obama", "Dost", "We are best friends.", (from,to,subject,content) -> System.out.printf("%s has sent mail to %s with subject as %s and content is ' %s '!%n",from,to,subject,content));
		MailSender.sender("PM Modi", "Obama", "Dost", "We are best friends.", (from,to,subject,content) -> System.out.printf("%s has sent mail to %s with subject as %s and content is ' %s '!%n",from,to,subject,content));
		MailSender.sender("PM Modi", "Obama", "Dost", "We are best friends.", (from,to,subject,content) -> System.out.printf("%s has sent mail to %s with subject as %s and content is ' %s '!%n",from,to,subject,content));
		MailSender.sender("PM Modi", "Obama", "Dost", "We are best friends.", (from,to,subject,content) -> System.out.printf("%s has sent mail to %s with subject as %s and content is ' %s '!%n",from,to,subject,content));
		MailSender.sender("PM Modi", "Obama", "Dost", "We are best friends.", (from,to,subject,content) -> System.out.printf("%s has sent mail to %s with subject as %s and content is ' %s '!%n",from,to,subject,content));
		MailSender.sender("PM Modi", "Obama", "Dost", "We are best friends.", (from,to,subject,content) -> System.out.printf("%s has sent mail to %s with subject as %s and content is ' %s '!%n",from,to,subject,content));
		MailSender.sender("PM Modi", "Obama", "Dost", "We are best friends.", (from,to,subject,content) -> System.out.printf("%s has sent mail to %s with subject as %s and content is ' %s '!%n",from,to,subject,content));
		MailSender.sender("PM Modi", "Obama", "Dost", "We are best friends.", (from,to,subject,content) -> System.out.printf("%s has sent mail to %s with subject as %s and content is ' %s '!%n",from,to,subject,content));
		MailSender.sender("PM Modi", "Obama", "Dost", "We are best friends.", (from,to,subject,content) -> System.out.printf("%s has sent mail to %s with subject as %s and content is ' %s '!%n",from,to,subject,content));
		sender("PM Modi", "Obama", "Dost", "We are best friends.", (from,to,subject,content) -> System.out.printf("%s has sent mail to %s with subject as %s and content is ' %s '!%n",from,to,subject,content));
	}
	
	private void demoTwo(){
		IMailService mailService = (from,to,subject,content) -> System.out.printf("%s has sent mail to %s with subject as %s and content is ' %s '!%n",from,to,subject,content);	
		mailService.sendMail("PM Modi", "Obama", "Dost", "We are good friends.");
	}

	
	private void demoOne(){
		IMailService mailService = new IMailService() {
			
			public void sendMail(String from, String to, String subject, String content) {
				System.out.printf("%s has sent mail to %s with subject as %s and content is ' %s '!%n",from,to,subject,content);				
			}
		};		
				
		mailService.sendMail("PM Modi", "Obama", "Dost", "We are friends.");
	}
	
	public void sender(String from, String to, String subject, String content,IMailService mailService){
		mailService.sendMail(from,to,subject,content);
	}

}
