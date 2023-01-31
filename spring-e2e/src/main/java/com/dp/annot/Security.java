package com.dp.annot;

import org.springframework.stereotype.Component;

@Component("secComponent")
public class Security implements ISecurity {
	
	
	public String process() {
		return "security process....";
	}

	public String getSecurity() {
		return "Moderate security process....";
	}
}
