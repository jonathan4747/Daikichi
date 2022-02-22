package com.codingdojo.controladores;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControladorDaikichi {
	@RequestMapping( value="/daikichi", method=RequestMethod.GET)
	public String helloDaikichi() {
		return "Welcome!!";
	}
	@RequestMapping( value="/daikichi/today", method=RequestMethod.GET)
	public String todayDaikichi() {
		return "today you will find luck in all your endeavors";
	}
	
	@RequestMapping( value="/daikichi/tomorrow", method=RequestMethod.GET)
	public String tomorrowDaikichi() {
		return "Tomorrow, an opportunity will arise, so be sure to ben open to news ideas!!";
	}

}
