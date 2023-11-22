package com.example.junitexample.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AreaServiceImplTest {
    AreaServiceImpl areaService = new AreaServiceImpl() ;


    @Test
    @DisplayName("Get Area Results")
    void getAreaResult() {

        String equaltyString = "Circle area is: 50 Square area is 25 Reactangle area is :10";
        String notEqualtyString = "Circle area is: 40 Square area is 255 Reactangle area is :134";

        assertEquals(equaltyString,areaService.getAreaResult());

        assertAll(()->assertEquals(equaltyString,areaService.getAreaResult()),
                ()->assertNotEquals(notEqualtyString,areaService.getAreaResult()));
    }
}