package com.nasa;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoboticRoverTest {

    @Test
    public void testRover() {
        char direction = 'N';
        String letters = "LMLMLMLMM";
        RoboticRover rover = new RoboticRover(1, 2, direction, letters);

        rover.initialProcessing();

        assertEquals("1 3 N", rover.toString());
    }

    @Test
    public void testRoverWithInitialPositonThreeThreeEast() {
        char direction = 'E';
        String letters = "MMRMMRMRRM";
        RoboticRover rover = new RoboticRover(3, 3, direction, letters);

        rover.initialProcessing();

        assertEquals("5 1 E", rover.toString());
    }
}
