package com.xiaot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class QueryController {

	@RequestMapping({"/query","/"})
	public String query(){
		System.out.println("query");
		return "query";
	}


}
