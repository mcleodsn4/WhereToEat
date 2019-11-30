
package com.wheretoeat.dto;

import java.util.ArrayList;
import java.util.List;

/**
 * This array will hold the multiple RestaurantDTO values based on the search/random criteria selected. 
 * @author lopezrjo
 *
 */
public class RestaurantList {

	private List<RestaurantDTO> restaurants = new ArrayList<RestaurantDTO>();
	public List<RestaurantDTO> getRestaurants() {
		return restaurants;
	}

	public void setRestaurants(List<RestaurantDTO> restaurants) {
		this.restaurants = restaurants;
	}
	
	
}
