package com.wheretoeat.dto;

import java.util.List;

/**
 * This array will hold the multiple RestaurantDTO values based on the search/random criteria selected. 
 * @author lopezrjo
 *
 */
public class RestaurantList {

	private List<RestaurantDTO> restaurants = null;

	public List<RestaurantDTO> getRestaurants() {
		return restaurants;
	}

	public void setRestaurants(List<RestaurantDTO> restaurants) {
		this.restaurants = restaurants;
	}
	
	
}
