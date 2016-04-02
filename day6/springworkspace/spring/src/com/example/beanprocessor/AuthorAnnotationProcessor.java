package com.example.beanprocessor;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class AuthorAnnotationProcessor implements BeanPostProcessor{

	public Object postProcessBeforeInitialization(Object bean, String id) throws BeansException {
			System.out.printf("Bean Name ( %s ) : Inside postProcessBeforeInitialization!%n",id);
			return bean;
	}

	public Object postProcessAfterInitialization(Object bean, String id) throws BeansException {

		Class cls = bean.getClass();
		
		if(cls.isAnnotationPresent(Author.class)==true){
			Annotation annotations[] = cls.getAnnotations();
			for(Annotation annotation : annotations){
				if(annotation instanceof Author){
					Author author = (Author)annotation;
					System.out.printf("Class %s ---- author is : %s.%n",cls.getName(),author.name());
				}
			}
		}
		
		Method methods[] = cls.getDeclaredMethods();	
		for(Method method : methods){
			if(method.isAnnotationPresent(Author.class) == true){
				Annotation annotations[] = method.getAnnotations();
				for(Annotation annotation : annotations){
					if(annotation instanceof Author){
						Author author = (Author)annotation;
						System.out.printf("Method %s ---- author is : %s.%n",cls.getName()+"."+method.getName(),author.name());
					}
				}
				
			}
		}
		return bean;
	}
}
