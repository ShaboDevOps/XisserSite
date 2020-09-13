package com.Xisser.ControlllerPKG;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.Xisser.Model.Message;
import com.Xisser.Model.MessageIN;
import com.Xisser.Model.Subscriber;
import com.Xisser.Model.SubscriberIN;

@RestController
public class ControllerClass {

	@Autowired
	MessageIN dataAcc;
	
	@Autowired
	SubscriberIN subAcc;
	
	@RequestMapping("")
	public ModelAndView homepage() {
		ModelAndView model = new ModelAndView();
		model.setViewName("home.html");
		
		return model;
	}
	

	@RequestMapping("/send")
	public ModelAndView send(Message data) {
		ModelAndView model = new ModelAndView();
		model.setViewName("home.html");
		
		dataAcc.save(data);
		
		
		return model;
	}

	@RequestMapping("/subscribe")
	public ModelAndView subscribe(Subscriber data) {
		ModelAndView model = new ModelAndView();
		model.setViewName("home.html");
		subAcc.save(data);
		
		return model;
	}
}
