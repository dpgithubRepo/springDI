package com.dp.annot;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotBeanScopeDriver {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appContext-Annot.xml");
		Timer timer = context.getBean("timer", Timer.class);
		Timer timer1 = context.getBean("timer", Timer.class);
		System.out.println(timer == timer1); //false scope of Timer is prototype
		
		
		TennisCoach tCoach = context.getBean("tennisCoach", TennisCoach.class);
		TennisCoach tCoach1 = context.getBean("tennisCoach", TennisCoach.class);
		
		System.out.println(tCoach == tCoach1); //true scope of TennisCoach is singleton 
		
		context.close();
	}
}
