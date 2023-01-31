package com.dp.annot.noxml;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.dp.spring.Coach;
import com.dp.spring.FortuneService;

@Configuration
@ComponentScan("com.dp.annot")
@PropertySource("classpath:swim.properties")
public class SportConfig {

	@Bean
	public Coach swimCoach() {
		return new SwimCoach();
	}
	
	@Bean 
	public FortuneService waterFortuneService() {
		return new WaterFortuneService();
	}
}
