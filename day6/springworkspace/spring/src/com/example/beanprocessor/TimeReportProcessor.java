package com.example.beanprocessor;

import java.util.Date;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class TimeReportProcessor implements BeanPostProcessor{

	public Object postProcessBeforeInitialization(Object bean, String id) throws BeansException {
		System.out.printf("Bean Creation Time ( %s ) : %s%n",id,new Date().toString());
		return bean;
	}

	public Object postProcessAfterInitialization(Object bean, String id) throws BeansException {
		System.out.printf("Bean Name ( %s ) : Inside postProcessAfterInitialization!%n",id);
		return bean;
	}
}
