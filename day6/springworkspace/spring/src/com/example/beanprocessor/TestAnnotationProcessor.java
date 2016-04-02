package com.example.beanprocessor;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class TestAnnotationProcessor implements BeanPostProcessor{

	public Object postProcessBeforeInitialization(Object bean, String id) throws BeansException {
			System.out.printf("Bean Name ( %s ) : Inside postProcessBeforeInitialization!%n",id);
			return bean;
	}

	public Object postProcessAfterInitialization(Object bean, String id) throws BeansException {

		Class cls = bean.getClass();
		Method methods[] = cls.getDeclaredMethods();	
		for(Method method : methods){
			if(method.isAnnotationPresent(Test.class) == true){
				try {
					method.invoke(bean, null);
					System.out.printf("%s method tested OK!%n",bean.getClass()+"."+method.getName());
				} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
					e.printStackTrace();
				}
			}
		}
		return bean;
	}
}
