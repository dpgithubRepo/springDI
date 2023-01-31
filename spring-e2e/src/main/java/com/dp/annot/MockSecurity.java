package com.dp.annot;

import org.springframework.stereotype.Component;

@Component
public class MockSecurity implements ISecurity {

	@Override
	public String process() {
		return "Mock Process";
	}

	@Override
	public String getSecurity() {
		return "Mock Security";
	}

}
