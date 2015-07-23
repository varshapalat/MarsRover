package com.nasa;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoboticRoverTest {

    @Test
    public void testRover() {
        char direction = 'N';
        String letters = "LMLMLMLMM";
        RoboticRover rover = new RoboticRover(1, 2, direction, letters);

        rover.changePosition();

        assertEquals("1 3 N", rover.toString());
    }
}
