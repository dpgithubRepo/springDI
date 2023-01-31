package com.dp.spring;

public class HappyFortuneService implements FortuneService {
	
	
	public HappyFortuneService() {
		System.out.println("Happy Fortune Service Constructor . . . .");
	}
	
	public void init() {
		System.out.println("init method.....");
	}
	
	public void destroy() {
		System.out.println("destroy method....");
	}

	@Override
	public String getFortune() {
		return "good luck for today....";
	}

}
