package com.dp.spring;

import org.springframework.beans.factory.DisposableBean;

//Since the timer is defined in prototype scope the destroy method will not be called hence need to override the disposable bean interface and ovveride destroy method

public class Timer implements DisposableBean {

	public void init() {
		System.out.println("timer init in process....");
	}
	
	// this method is not used as the prototype scope bean destroy-method will not be called.
	public void cleanUp() {
		System.out.println("timer is being cleaned up.....");
	}


	@Override
	public void destroy() throws Exception {
		System.out.println("timer is being cleaned up in destroy method.....");
		
	}
}
