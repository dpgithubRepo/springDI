package com.dp.annot;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.dp.spring.Coach;

@Component
@Scope("singleton")
public class TennisCoach implements Coach {

	private ISecurity secService;

	@Autowired
	@Qualifier("mockSecurity")
	private ISecurity security;

	private Timer timer;

	@Autowired // this can be just done on private Timer times that is via field injection
	public void setTimer(Timer timer) {
		this.timer = timer;
	}

	@Autowired
	// this is redundant in case of latest versions of spring As of Spring Framework
	// 4.3, an @Autowired annotation on such a constructor is no longer necessary if
	// the target bean only defines one constructor to begin with. However, if
	// several constructors are available, at least one must be annotated to teach
	// the container which one to use.
	public TennisCoach(@Qualifier("secComponent") ISecurity secService) {
		this.secService = secService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice tennis in court for 5 hrs....";
	}

	@Override
	public String getDailyFortune() {
		return "good luck....hcoded !!";
	}

	@Override
	public String getSecurity() {
		return secService.getSecurity();
	}

	@Override
	public String getTimerService() {
		return timer.getTimer();
	}

	@PostConstruct
	public void postConstruct() {
		System.out.println("tennis coach post construct");
	}

	@PreDestroy
	public void preDestroy() {
		System.out.println("tennis coach pre destroy");
	}

}
