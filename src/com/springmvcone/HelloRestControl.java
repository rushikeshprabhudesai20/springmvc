package com.springmvcone;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestControl {
	
	@RequestMapping(path = "/hello.do", method = RequestMethod.GET)
	public String[] sayhello() {
		String[] topics = {"java", "jsp", "spring"};
		return topics;
	}
}
