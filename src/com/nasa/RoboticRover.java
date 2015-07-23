package com.nasa;

public class RoboticRover {
    int xPosition;
    int yPosition;
    char facingDirection;
    String letters;

    public RoboticRover(int initialX, int initialY, char initialDirection, String letters) {
        this.xPosition = initialX;
        this.yPosition = initialY;
        this.facingDirection = initialDirection;
        this.letters = letters;
    }

    public void initialProcessing(){

        int length = letters.length();
        char[] charArrayOfLetters = new char[10];
        for(int i=0; i<length; i++)
        {
            charArrayOfLetters[i] = letters.charAt(i);
        }
        for(int i=0; i<length; i++)
        {
            changePosition(charArrayOfLetters[i]);
        }
    }

    private void changePosition(char next) {

        if (next == 'L') {
            if (facingDirection == 'N')
                facingDirection = 'W';
            else if (facingDirection == 'S')
                facingDirection = 'E';
            else if (facingDirection == 'W')
                facingDirection = 'S';
            else if (facingDirection == 'E')
                facingDirection = 'N';
        }
        else if (next == 'R') {
            if (facingDirection == 'N')
                facingDirection = 'E';
            else if (facingDirection == 'S')
                facingDirection = 'W';
            else if (facingDirection == 'W')
                facingDirection = 'N';
            else if (facingDirection == 'E')
                facingDirection = 'S';
        }
        else if (next == 'M') {
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
