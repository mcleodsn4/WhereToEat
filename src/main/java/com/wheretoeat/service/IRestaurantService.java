package com.wheretoeat.service;

import com.wheretoeat.dto.FoodType;
import com.wheretoeat.dto.RestaurantDTO;

public interface IRestaurantService {

	/**
	 * 
	 * @param type - Takes a food type (category) enum 
	 * @return will return a restaurant object based on the food type selected.
	 */
	RestaurantDTO fetchByFoodType(FoodType type);

	/**
	 * This class should fetch a random restaurant. Will most like return a value from a 
	 * @return
	 */
	RestaurantDTO fetchRandomRestaurant();

}