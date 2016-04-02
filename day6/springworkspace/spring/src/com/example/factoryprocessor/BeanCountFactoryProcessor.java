package com.example.factoryprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

@Component
public class BeanCountFactoryProcessor implements BeanFactoryPostProcessor {

	public void postProcessBeanFactory(ConfigurableListableBeanFactory container) throws BeansException {
		
		System.out.printf("IoC Container bean count : %d.%n",container.getBeanDefinitionCount());
	}

}
