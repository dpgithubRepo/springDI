package com.dp.annot.noxml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.dp.spring.Coach;
import com.dp.spring.FortuneService;


@Component
public class SwimCoach implements Coach {
	
    @Value("${swim.coachmail}")
	private String email;
	
	@Autowired
	private FortuneService fortuneService;

	@Override
	public String getDailyWorkout() {
		return "message from => " + this.email + " ==> Practice reverse Swimming.....";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
