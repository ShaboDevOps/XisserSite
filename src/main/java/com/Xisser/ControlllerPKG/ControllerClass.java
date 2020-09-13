package com.Xisser.ControlllerPKG;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class ControllerClass {

	@RequestMapping("")
	public ModelAndView homepage() {
		ModelAndView model = new ModelAndView();
		model.setViewName("home.html");
		
		return model;
	}
	

	@RequestMapping("/send")
	public ModelAndView send() {
		ModelAndView model = new ModelAndView();
		model.setViewName("home.html");
		
		return model;
	}

	@RequestMapping("/subscribe")
	public ModelAndView subscribe() {
		ModelAndView model = new ModelAndView();
		model.setViewName("home.html");
		
		return model;
	}
}
