package com.wheretoeat.wheretoeat;

import com.wheretoeat.dto.FoodType;
import com.wheretoeat.dto.RestaurantDTO;
import com.wheretoeat.service.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import static org.junit.Assert.assertThat;


@RunWith(SpringRunner.class)
@SpringBootTest()
public class RestaurantServiceTests {

    //private String expectName = "MOCK NAME";

    public RestaurantDTO initRandomRestaurantDTO() {
    	RestaurantDTO restaurantDTO = new RestaurantDTO();
		restaurantDTO.setName("Conscious Kitchen");
		restaurantDTO.setDescription("Confort Food. Small Plates. Quick bite.");
		restaurantDTO.setAddress("912 Vine St, Cincinnati, OH 45219");
		restaurantDTO.setFoodType(FoodType.COMFORT);
		restaurantDTO.setHours("11AM-10PM");
		restaurantDTO.setRating(4.5);
		restaurantDTO.setPriceScale("$");
		return restaurantDTO;
    }
    
    public RestaurantDTO initTypeRestaurantDTO() {
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

    @Test
    public void shouldBeRestaurant() {
        assertThat(initRandomRestaurantDTO()).isExactlyInstanceOf(RestaurantDTO.class);
        assertThat(initTypeRestaurantDTO()).isExactlyInstanceOf(RestaurantDTO.class);
    }

    @Test
    public void shouldBeAbleToGetRestaurant() {
        RestaurantDTO restaurant  = initRandomRestaurantDTO();
        RestaurantServiceStub stub = new RestaurantServiceStub();
        assertEquals(restaurant.getName(), stub.fetchRandomRestaurant().getName());
    }

    @Test
    public void shouldBeAbletoGetFoodType() {
    	RestaurantDTO restaurant = initTypeRestaurantDTO();
    	RestaurantServiceStub stub = new RestaurantServiceStub();
    	assertEquals(restaurant.getFoodType(), stub.fetchByFoodType(FoodType.ASIAN).getFoodType());
    }
}
