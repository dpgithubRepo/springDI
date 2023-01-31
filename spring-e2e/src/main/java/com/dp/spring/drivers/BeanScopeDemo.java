package com.dp.spring.drivers;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dp.spring.Coach;
import com.dp.spring.FortuneService;

public class BeanScopeDemo {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-AppContext.xml");
		
		Coach myCoach1 = context.getBean(Coach.class);
		Coach myCoach2 = context.getBean(Coach.class);
		
		System.out.println(myCoach1 == myCoach2);  //true default scope is used in beanScope-AppContext.xml which is singleton for coach
		System.out.println("memory loc of myCoach1" + myCoach1);
		System.out.println("memory loc of myCoach2" + myCoach2);
		
		FortuneService fs1 = context.getBean(FortuneService.class);
		FortuneService fs2 = context.getBean(FortuneService.class);
		
		System.out.println("memory loc of fs1" + fs1);
		System.out.println("memory loc of fs2" + fs2);
		
		System.out.println(fs1==fs2);  //false prototype scope is used in beanScope-AppContext.xml for Fortuneservice
		
		
		
		context.close();
	}
}
