package com.dp.spring;

/**
 * The Class MyApp.
 * 
 * @author Durga Prasad
 */
public class MyApp {
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String... args) {
		
	//	BaseballCoach coach = new BaseballCoach();
	//	System.out.println(coach.getDailyWorkout());

		Coach theCoach = new BaseballCoach();
		System.out.println(theCoach.getDailyWorkout());
		//System.out.println(theCoach.getDailyFortune());
		
		theCoach = new TrackCoach();
		System.out.println(theCoach.getDailyWorkout());
		//System.out.println(theCoach.getDailyFortune());
		
		
		//theCoach = new CricketCoach();
		
	}
}
