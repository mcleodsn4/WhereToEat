package com.wheretoeat.dto;

public enum FoodType {
	
	ASIAN("Asian"),
	CAFE("Cafe"),
	COMFORT("Commfort Food"),
	CHINESE("Chinese"),
	FASTFOOD("Fast-Food"),
	INDIAN("Indian"),
	ITALIAN("Italian"),
	PIZZA("Pizza"),
	VEGETARIAN("Vegetarian");
	
	private String type;
	
	FoodType(String type){
		this.type = type;
	}
	
	public String type() {
		return type;
	}
	
}
