
package com.wheretoeat.service;

import com.wheretoeat.dto.FoodType;
import com.wheretoeat.dto.RestaurantDTO;
import java.util.concurrent.ThreadLocalRandom;
import org.springframework.stereotype.Component;

/**
 * 
 * @author lopezrjo
 *
 */
@Component
public class RestaurantServiceStub implements IRestaurantService {
	/**
	 * 
	 * @param type - Takes a food type (category) enum 
	 * @return will return a restaurant object based on the food type selected.
	 */
	@Override
	public RestaurantDTO fetchByFoodType (FoodType type) {
		RestaurantDTO[] restaurantArray = new RestaurantDTO[4];
		
		RestaurantDTO restaurantAsian = new RestaurantDTO();
		restaurantAsian.setName("Pho Lang Thang");
		restaurantAsian.setDescription("Upbeat Vietnamese joint inside Findlay Market for bowls of pho & banh mi sandwiches.");
		restaurantAsian.setAddress("1828 Race St, Cincinnati, OH 45202");
		restaurantAsian.setFoodType(FoodType.ASIAN);
		restaurantAsian.setHours("11AM-11PM");
		restaurantAsian.setRating(4.6);
		restaurantAsian.setPriceScale("$");
		
		RestaurantDTO restaurantPizza = new RestaurantDTO();
		restaurantPizza.setName("Mios");
		restaurantPizza.setDescription("Cincinnati pizza spot with good food and a bearcat presence.");
		restaurantPizza.setAddress("2634 Vine St, Cincinnati, OH 45219");
		restaurantPizza.setFoodType(FoodType.PIZZA);
		restaurantPizza.setHours("11AM-11PM");
		restaurantPizza.setRating(4.8);
		restaurantPizza.setPriceScale("$$");
		
		RestaurantDTO restaurantCafe = new RestaurantDTO();
		restaurantCafe.setName("Panera");
		restaurantCafe.setDescription("Paying too much money for too little food.");
		restaurantCafe.setAddress("120 Calhoun St, Cincinnati, OH 45219");
		restaurantCafe.setFoodType(FoodType.CAFE);
		restaurantCafe.setHours("6AM-9PM");
		restaurantCafe.setRating(2.3);
		restaurantCafe.setPriceScale("$$");
		
		RestaurantDTO restaurantComfort = new RestaurantDTO();
		restaurantComfort.setName("Alabama Que");
		restaurantComfort.setDescription("Local BBQ place with good fruit punch.");
		restaurantComfort.setAddress("2733 Short Vine St, Cincinnati, OH 45219");
		restaurantComfort.setFoodType(FoodType.COMFORT);
		restaurantComfort.setHours("11AM-9PM");
		restaurantComfort.setRating(4.5);
		restaurantComfort.setPriceScale("$");
		
		restaurantArray[0] = restaurantAsian;
		restaurantArray[1] = restaurantPizza;
		restaurantArray[2] = restaurantCafe;
		restaurantArray[3] = restaurantComfort;
		
		switch (type) {
		
		case COMFORT:
			return restaurantArray[3];
			
		case PIZZA:
			return restaurantArray[1];
			
		case ASIAN:
			return restaurantArray[0];
			
		case CAFE:
			return restaurantArray[2];
			
		default:
			return restaurantArray[0];
		}
	}
	/**
	 * This class should fetch a random restaurant. Will most like return a value from an array.
	 * @return
	 */
	@Override
	public RestaurantDTO fetchRandomRestaurant ( ) {
		RestaurantDTO[] restaurantArray = new RestaurantDTO[4];
		
		RestaurantDTO restaurantAsian = new RestaurantDTO();
		restaurantAsian.setName("Pho Lang Thang");
		restaurantAsian.setDescription("Upbeat Vietnamese joint inside Findlay Market for bowls of pho & banh mi sandwiches.");
		restaurantAsian.setAddress("1828 Race St, Cincinnati, OH 45202");
		restaurantAsian.setFoodType(FoodType.ASIAN);
		restaurantAsian.setHours("11AM-11PM");
		restaurantAsian.setRating(4.6);
		restaurantAsian.setPriceScale("$");
		
		RestaurantDTO restaurantPizza = new RestaurantDTO();
		restaurantAsian.setName("Mios");
		restaurantAsian.setDescription("Cincinnati pizza spot with good food and a bearcat presence.");
		restaurantAsian.setAddress("2634 Vine St, Cincinnati, OH 45219");
		restaurantAsian.setFoodType(FoodType.PIZZA);
		restaurantAsian.setHours("11AM-11PM");
		restaurantAsian.setRating(4.8);
		restaurantAsian.setPriceScale("$$");
		
		RestaurantDTO restaurantCafe = new RestaurantDTO();
		restaurantAsian.setName("Panera");
		restaurantAsian.setDescription("Paying too much money for too little food.");
		restaurantAsian.setAddress("120 Calhoun St, Cincinnati, OH 45219");
		restaurantAsian.setFoodType(FoodType.CAFE);
		restaurantAsian.setHours("6AM-9PM");
		restaurantAsian.setRating(2.3);
		restaurantAsian.setPriceScale("$$");
		
		RestaurantDTO restaurantComfort = new RestaurantDTO();
		restaurantComfort.setName("Conscious Kitchen");
		restaurantComfort.setDescription("Confort Food. Small Plates. Quick bite.");
		restaurantComfort.setAddress("912 Vine St, Cincinnati, OH 45219");
		restaurantComfort.setFoodType(FoodType.COMFORT);
		restaurantComfort.setHours("11AM-10PM");
		restaurantComfort.setRating(4.5);
		restaurantComfort.setPriceScale("$");
		
		restaurantArray[0] = restaurantAsian;
		restaurantArray[1] = restaurantPizza;
		restaurantArray[2] = restaurantCafe;
		restaurantArray[3] = restaurantComfort;
		
		int randomNumber = ThreadLocalRandom.current().nextInt(0, 4);
		
		return restaurantArray[randomNumber];
	}
}

