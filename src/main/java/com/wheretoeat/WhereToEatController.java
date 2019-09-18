package com.wheretoeat;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WhereToEatController {

	@RequestMapping("/start")
	public String start() {
		return "start";
	}
	
}
