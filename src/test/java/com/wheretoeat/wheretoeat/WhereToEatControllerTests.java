package com.wheretoeat.wheretoeat;

import com.wheretoeat.WhereToEatController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.fail;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


@RunWith(SpringRunner.class)
@SpringBootTest()
@AutoConfigureMockMvc
public class WhereToEatControllerTests {
    @Autowired
    private WhereToEatController controller;

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void shouldLoad() throws Exception {
        try {
            assertThat(controller).isNotNull();
        } catch (Exception e) {
            fail();
        }
    }

    @Test
    public void shouldHasView_start() throws Exception {
        this.mockMvc.perform(get("/start"))
                .andExpect(status().isOk())
                .andExpect(view().name(WhereToEatController.START_TEMPLATE));
    }

    @Test
    public void viewShouldHasFollowingAttributes() throws Exception {
        this.mockMvc.perform(get("/start"))
            .andExpect(model().attributeExists(
                WhereToEatController.FOOD_ATTRIBUTE,
                WhereToEatController.PRICE_ATTRIBUTE,
                WhereToEatController.BUSY_RANGE_ATTRIBUTE,
                WhereToEatController.RATING_ATTRIBUTE)
            );
    }
}
