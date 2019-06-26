package com.mvc.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mvc.model.DataService;

@Controller
public class FirstController {
@Autowired
	DataService ds;
	@RequestMapping("/hello")
	public String firstHandler(ModelMap m){
		String n="JAVA SPRING STRUTS";
		m.addAttribute("data",n);
		m.addAttribute("Programmers",ds.getProgrammers());
		return "first";
	}

}
