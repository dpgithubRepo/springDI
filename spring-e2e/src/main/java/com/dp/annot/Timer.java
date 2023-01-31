package com.dp.annot;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Timer implements DisposableBean {
  public String process() {
	return "Process Time....";
  }
  
  public  String getTimer() {
		return "timer Service started for Tennis...";
	}
  
  @PostConstruct
  public void postConstruct() {
	  System.out.println("timer post construct");
  }
  
  @PreDestroy
  public void preDestroy() {
	  System.out.println("timer pre destroy");  // this will not be called as the timer is prototype scoped
  }

@Override
public void destroy() throws Exception {
	System.out.println("timer destroy triggered - disposable bean & SportAnnotBeanProcessor ");
	
}
}
 