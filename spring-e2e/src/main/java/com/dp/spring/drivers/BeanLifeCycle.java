package com.dp.spring.drivers;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dp.spring.Coach;

public class BeanLifeCycle {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycle-AppContext.xml");
		
		Coach myCoach = context.getBean(Coach.class);
		
		System.out.println(myCoach.getDailyWorkout());
		System.out.println(myCoach.getDailyFortune());
		
		context.close();
	}

}
