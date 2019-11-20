
package com.wheretoeat.service;

import com.wheretoeat.dto.FoodType;
import com.wheretoeat.dto.RestaurantDTO;

/**
 * 
 * @author lopezrjo
 *
 */
public class RestaurantServiceStub implements IRestaurantService {
	/**
	 * 
	 * @param type - Takes a food type (category) enum 
	 * @return will return a restaurant object based on the food type selected.
	 */
	@Override
	public RestaurantDTO fetchByFoodType (FoodType type) {
		RestaurantDTO restaurantDTO = new RestaurantDTO();
		restaurantDTO.setName("Pho Lang Thang");
		restaurantDTO.setDescription("Upbeat Vietnamese joint inside Findlay Market for bowls of pho & banh mi sandwiches.");
		restaurantDTO.setAddress("1828 Race St, Cincinnati, OH 45202");
		restaurantDTO.setFoodType(FoodType.ASIAN);
		restaurantDTO.setHours("11AM-11PM");
		restaurantDTO.setRating(4.6);
		restaurantDTO.setPriceScale("$");
		return restaurantDTO;
	}
	/**
	 * This class should fetch a random restaurant. Will most like return a value from an array.
	 * @return
	 */
	@Override
	public RestaurantDTO fetchRandomRestaurant ( ) {
		RestaurantDTO restaurantDTO = new RestaurantDTO();
		restaurantDTO.setName("Conscious Kitchen");
		restaurantDTO.setDescription("Comfort Food. Small Plates. Quick Bite.");
		restaurantDTO.setAddress("912 Vine St, Cincinnati, OH 45219");
		restaurantDTO.setFoodType(FoodType.COMFORT);
		restaurantDTO.setHours("11AM-10PM");
		restaurantDTO.setRating(4.5);
		restaurantDTO.setPriceScale("$");
		return restaurantDTO;
	}
}

