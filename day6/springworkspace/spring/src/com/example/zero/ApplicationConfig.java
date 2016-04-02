package com.example.zero;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.core.io.ClassPathResource;

@Configuration
@ComponentScan
public class ApplicationConfig {
	
	@Bean
	@Scope("singleton")
	@Lazy(true)
	public AccountService accountService(){
		return new AccountService();
	}
	
	//Outjection of value as a bean in IoC Container
	@Bean(name="employeeId")
	public int generate(){
		return (int)(System.nanoTime()*Runtime.getRuntime().freeMemory());
	}

	@Bean(name="dateFormatted")
	public String generateDOB(){
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		return dateFormat.format(new Date());
	}

	@Bean
	public PropertyPlaceholderConfigurer loadFiles(){
		PropertyPlaceholderConfigurer configurer = new PropertyPlaceholderConfigurer();
		configurer.setLocation(new ClassPathResource("com/example/zero/application.properties"));
		return configurer;
	}
	
	
	/*
	@Bean
	public LibraryService libraryService(){
		return new LibraryService();
	}*/

}
