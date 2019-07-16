package com.example.demofin.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class Properties {
	
	@Autowired
	private Environment env;
	
	public String getPropertyByKey(String key) {
		return env.getProperty(key);
	}

}
