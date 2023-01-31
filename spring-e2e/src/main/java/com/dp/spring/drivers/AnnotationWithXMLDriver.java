package com.dp.spring.drivers;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dp.annot.Security;
import com.dp.annot.TennisCoach;
import com.dp.annot.Timer;

public class AnnotationWithXMLDriver {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appContext-Annot.xml");
		Timer timer = context.getBean("timer", Timer.class); //timer -> default id given nothing mentioned
		System.out.println(timer.process());

		Security sec= (Security) context.getBean("secComponent");  //secComponent -> id given @Component
		System.out.println(sec.process());
		
		
		
		TennisCoach tCoach = context.getBean("tennisCoach", TennisCoach.class);
		
		System.out.println(tCoach.getDailyFortune());
		System.out.println(tCoach.getDailyWorkout());
		System.out.println(tCoach.getSecurity());
		System.out.println(tCoach.getTimerService());
		
		context.close();

	}

}
