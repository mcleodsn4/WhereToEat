package com.wheretoeat.service;

import com.wheretoeat.dto.FoodType;
import com.wheretoeat.dto.RestaurantDTO;

public class RestaurantServiceStub {

	public RestaurantDTO fetchByFoodType (FoodType type) {
		RestaurantDTO restaurantDTO = new RestaurantDTO();
		restaurantDTO.setName("Pho Lang Thang");
		restaurantDTO.setDescription("Upbeat Vietnamese joint inside Findlay Market for bowls of pho & banh mi sandwiches.");
		restaurantDTO.setAddress("1828 Race St, Cincinnati, OH 45202");
		restaurantDTO.setFoodType(FoodType.ASIAN);
		restaurantDTO.setHours("11AM-11PM");
		return restaurantDTO;
		
	}
}
