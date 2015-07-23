package com.nasa;
//The robotic rover has an initial position. It accepts the commands and changes its positon.
public class RoboticRover {
    int xPosition;
    int yPosition;
    char facingDirection;
    String commands;

    public RoboticRover(int initialX, int initialY, char initialDirection, String letters) {
        this.xPosition = initialX;
        this.yPosition = initialY;
        this.facingDirection = initialDirection;
        this.commands = letters;
    }

    public void initialProcessing(){

        int length = commands.length();
        char[] commandAtPosition = new char[20];
        for(int i=0; i<length; i++)
        {
            commandAtPosition[i] = commands.charAt(i);
        }
        for(int i=0; i<length; i++)
        {
            changePosition(commandAtPosition[i]);
        }
    }

    private void changePosition(char nextCommand) {

        if (nextCommand == 'L') {
            if (facingDirection == 'N')
                facingDirection = 'W';
            else if (facingDirection == 'S')
                facingDirection = 'E';
            else if (facingDirection == 'W')
                facingDirection = 'S';
            else if (facingDirection == 'E')
                facingDirection = 'N';
        }
        else if (nextCommand == 'R') {
            if (facingDirection == 'N')
                facingDirection = 'E';
            else if (facingDirection == 'S')
                facingDirection = 'W';
            else if (facingDirection == 'W')
                facingDirection = 'N';
            else if (facingDirection == 'E')
                facingDirection = 'S';
        }
        else if (nextCommand == 'M') {
            if (facingDirection == 'N')
                yPosition++;
            else if (facingDirection == 'S')
                yPosition--;
            else if (facingDirection == 'W')
                xPosition--;
            else if (facingDirection == 'E')
                xPosition++;
        }
    }

    @Override
    public String toString() {
        return xPosition + " " + yPosition + " " + facingDirection;
    }
}
