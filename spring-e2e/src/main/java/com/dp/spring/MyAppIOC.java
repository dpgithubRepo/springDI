package com.dp.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * The Class MyAppIOC.
 * 
 * @author Durga Prasad
 */
public class MyAppIOC {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		
		System.out.println("\n=============== Cricket coach in charge now ===============");
		CricketCoach myCoach = applicationContext.getBean(CricketCoach.class);
		System.out.println(myCoach.getDailyWorkout());
		System.out.println(myCoach.getDailyFortune());
		System.out.println(myCoach.getEmailAddress());
		System.out.println(myCoach.getTeam());

		
		
		System.out.println("\n=============== Base ball coach in charge now ===============");
		BaseballCoach mybbCoach = applicationContext.getBean(BaseballCoach.class);
		System.out.println(mybbCoach.getDailyWorkout());
		System.out.println(mybbCoach.getDailyFortune());

		
		System.out.println("\n=============== Track coach in charge now ===============");
		TrackCoach myTrackCoach = applicationContext.getBean(TrackCoach.class);
		System.out.println(myTrackCoach.getDailyWorkout());
		System.out.println(myTrackCoach.getDailyFortune());
	}

}
