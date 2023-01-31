package com.dp.spring;

/**
 * The Class BaseballCoach.
 * 
 * @author Durga Prasad
 */
public class BaseballCoach implements Coach{
	
	private FortuneService fortuneService;
	
	
	public BaseballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public BaseballCoach() {
		
	}
	
	/**
	 * Gets the daily workout.
	 *
	 * @return the daily workout
	 */
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice. . .";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
