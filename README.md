MARS ROVER
===============
Using this project, one can navigate a rover on the mars plateau by providing appropriate inputs.

Requirements
=============

The requirements of this application are:

[1] IntelliJ IDEA

[2] Ant

[3] JUnit 4.11

[4] Hamcrest Core 1.3

Input
=============

The first line of input is the upper-right coordinates of the plateau, the lower-left coordinates are assumed to be 0,0.
The rest of the input is information pertaining to the rovers that have been deployed. Each rover has two lines of input. 
The first line gives the rover’s position, and the second line is a series of instructions telling the rover how to explore the plateau.
The position is made up of two integers and a letter separated by spaces, corresponding to the x and y co-ordinates and the rover’s orientation.
Each rover will be finished sequentially, which means that the second rover won’t start to move until the first one has finished moving.

Output
========

The output for each rover should be its final co-ordinates and heading.

How to Run?
============

To run the application in your system, just open the application in IntelliJ IDEA,
then goto Run -> Run or you can press options+shift+F10

How to Build
=============

This application using the Ant Build System. You can change your build settings by changing 
the **build.xml** present in the project directory. To build the application, just type following
command in your shell:

    $ ant