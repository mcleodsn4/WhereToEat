package com.wheretoeat;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;

@Controller
@SpringBootApplication
public class WhereToEatController {

	@RequestMapping("/start")
	public String start() {
		return "start";
	}	
}
