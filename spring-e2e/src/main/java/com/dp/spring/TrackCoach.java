package com.dp.spring;

/**
 * The Class TrackCoach.
 * 
 * @author Durga Prasad
 */
public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;
	

	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	

	public TrackCoach() {
		
	}
	
	
	
	/**
	 * Gets the daily workout.
	 *
	 * @return the daily workout
	 */
	
	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k . . .";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
