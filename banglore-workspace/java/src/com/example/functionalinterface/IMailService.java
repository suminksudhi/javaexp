package com.example.functionalinterface;

@FunctionalInterface
public interface IMailService {
	public abstract void sendMail(String from,String to,String subject,String content);
}