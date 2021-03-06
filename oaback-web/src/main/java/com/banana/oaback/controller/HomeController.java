package com.banana.oaback.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@RequestMapping(value="/", method=RequestMethod.GET, produces="application/json")
	public String home() {
		logger.info("home");
		return "home";
	}
	
	@RequestMapping(value="/hello", method=RequestMethod.GET, produces="application/json")
	public void hello() {
		logger.info("hello, http test!");
	}
	
}
