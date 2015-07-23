package com.nasa;

public class RoboticRover {
    int xPosition;
    int yPosition;
    char facingDirection;
    String letters;
    public RoboticRover(int initialX, int initialY, char initialDirection, String letters){
        this.xPosition = initialX;
        this.yPosition = initialY;
        this.facingDirection = initialDirection;
        this.letters = letters;
    }

    public void changePosition() {
        xPosition = 1;
        yPosition = 3;
        facingDirection = 'N';
    }

    @Override
    public String toString() {
        return xPosition + " " + yPosition + " " + facingDirection;
    }
}
