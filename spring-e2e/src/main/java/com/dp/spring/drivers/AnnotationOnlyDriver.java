package com.dp.spring.drivers;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.dp.annot.noxml.SportConfig;
import com.dp.spring.Coach;

public class AnnotationOnlyDriver {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		Coach coach = context.getBean("tennisCoach", Coach.class);
		System.out.println(coach.getDailyFortune());
		System.out.println(coach.getDailyWorkout());
		
		coach = context.getBean("swimCoach", Coach.class);
		System.out.println(coach.getDailyFortune());
		System.out.println(coach.getDailyWorkout());
		
		context.close();
	}
}
