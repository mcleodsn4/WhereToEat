package com.wheretoeat.wheretoeat;

import com.wheretoeat.dto.FoodType;
import com.wheretoeat.dto.RestaurantDTO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

@RunWith(SpringRunner.class)
@SpringBootTest()
/**
 * 
 * Ensures that a mock restaurant matches the instances of restaurant DTO.
 */
public class RestaurantDTOTests {

    private String expectName = "MOCK NAME";

    public RestaurantDTO initRestaurantDTO() {
        RestaurantDTO restaurantDTO = new RestaurantDTO();
        restaurantDTO.setName(expectName);
        restaurantDTO.setDescription("MOCK NAME");
        restaurantDTO.setAddress("MOCK NAME");
        restaurantDTO.setHours("MOCK NAME");
        restaurantDTO.setOpen(true);
        restaurantDTO.setWebsite("MOCK NAME");
        restaurantDTO.setRating(2.5);
        restaurantDTO.setPriceScale("MOCK NAME");
        restaurantDTO.setBysyness("MOCK NAME");
        restaurantDTO.setLatitude(100);
        restaurantDTO.setLongitude(200);
        restaurantDTO.setFoodType(FoodType.ASIAN);
        return restaurantDTO;
    }

    @Test
    public void shouldCreate() {
        assertThat(initRestaurantDTO()).isExactlyInstanceOf(RestaurantDTO.class);
    }

    @Test
    public void shouldBeAbleToGetValue() {
        RestaurantDTO restaurant  = initRestaurantDTO();
        assertEquals(restaurant.getName(), expectName);
    }

    @Test
    public void shouldBeAbleToSetValue() {
        String expectNewName = "UPDATE NAME";
        RestaurantDTO restaurant  = initRestaurantDTO();
        restaurant.setName(expectNewName);
        assertEquals(restaurant.getName(), expectNewName);
    }
}
