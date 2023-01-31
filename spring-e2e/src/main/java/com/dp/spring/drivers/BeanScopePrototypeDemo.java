package com.dp.spring.drivers;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dp.spring.Timer;

public class BeanScopePrototypeDemo {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-PrototypeScope.xml");
		
		Timer myCoach1 = context.getBean(Timer.class);
		
		context.close();
	}
}
