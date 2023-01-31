package com.dp.annot.noxml;

import com.dp.spring.FortuneService;

public class WaterFortuneService implements FortuneService{

	@Override
	public String getFortune() {
		return  "Good Luck under water....!!!";
	}

}
