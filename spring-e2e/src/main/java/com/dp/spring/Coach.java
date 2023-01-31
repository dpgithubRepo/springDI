package com.dp.spring;

// TODO: Auto-generated Javadoc
/**
 * The Interface Coach.
 * 
 * @author Durga Prasad
 */
public interface Coach {
	
	/**
	 * Gets the daily workout.
	 *
	 * @return the daily workout
	 */
	String getDailyWorkout();
	
	
	String getDailyFortune();
	
	
	default String getSecurity() {
		return "Plain Security";
	}
	
	
	default String getTimerService() {
		return "timer Service started...";
	}
}
