package com.wheretoeat;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.wheretoeat.dto.Option;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.boot.SpringApplication;

@Controller
public class WhereToEatController {

	public static final String FOOD_ATTRIBUTE = "foodTypeOptions";
	public static final String PRICE_ATTRIBUTE = "priceRangeOptions";
	public static final String BUSY_RANGE_ATTRIBUTE = "busyRangeOptions";
	public static final String RATING_ATTRIBUTE = "ratingOptions";
	public static final String START_TEMPLATE = "start";

	@RequestMapping(value="/start", method=RequestMethod.GET)
	public ModelAndView start() {
		List<Option> foodTypeOptions = new ArrayList<Option>();		
		foodTypeOptions.add(new Option("","Food Type"));
		foodTypeOptions.add(new Option("chinese","Chinese"));
		foodTypeOptions.add(new Option("italian","Italian"));
		foodTypeOptions.add(new Option("asian","Asian (Includes all Asian countries)"));
		foodTypeOptions.add(new Option("indian","Indian"));
		foodTypeOptions.add(new Option("fastFood","Fast-Food"));
		foodTypeOptions.add(new Option("cafe","Cafe"));
		
//		foodTypeOptions.add("Chinese");
//		foodTypeOptions.add("Italian");
//		foodTypeOptions.add("Asian (Includes all Asian countries)");
//		foodTypeOptions.add("Indian");
//		foodTypeOptions.add("Fast-Food");
//		foodTypeOptions.add("Cafe");
		
		List<Option> priceRangeOptions = new ArrayList<Option>();	
		priceRangeOptions.add(new Option("","Price Range"));
		priceRangeOptions.add(new Option("5To10","5$ - 10$"));
		priceRangeOptions.add(new Option("10To15","10$ - 15$"));
		priceRangeOptions.add(new Option("15To20","15$ - 20$"));
		priceRangeOptions.add(new Option("over20","Over 20$"));
		
		List<Option> busyRangeOptions = new ArrayList<Option>();	
		busyRangeOptions.add(new Option("","Busy Range"));
		busyRangeOptions.add(new Option("notBusy","Not Busy"));
		busyRangeOptions.add(new Option("slightlyBusy","Slightly Busy"));
		busyRangeOptions.add(new Option("busy","Busy"));
		busyRangeOptions.add(new Option("veryBusy","Very Busy"));
		
		List<Option> ratingOptions = new ArrayList<Option>();	
		ratingOptions.add(new Option("","Ratings Range"));
		ratingOptions.add(new Option("1","1 Star +"));
		ratingOptions.add(new Option("2","2 Star +"));
		ratingOptions.add(new Option("3","3 Star +"));
		ratingOptions.add(new Option("4","4 Star +"));
		
		ModelAndView model = new ModelAndView();
		model.setViewName(START_TEMPLATE);
		model.addObject(FOOD_ATTRIBUTE, foodTypeOptions);
		model.addObject(PRICE_ATTRIBUTE, priceRangeOptions);
		model.addObject(BUSY_RANGE_ATTRIBUTE, busyRangeOptions);
		model.addObject(RATING_ATTRIBUTE, ratingOptions);
		return model;
	}	
}

