# Random D&D Dice Rolls
## Description
This program creates and rolls five randomly chosen
'Dungeons & Dragons' dice. Dice choices in Dungeons and Dragons are as follows: D4, D6, D8, D10, D12, D20, and D100 (D stands for 'die', and the number represents the number of faces of the type of die). The random results are
displayed to the user.

Below is an example of output from the program (*results will differ from the example output, since the program is random*).

`d12 = 11, d8 = 3, d4 = 3, d100 = 11, d8 = 6`

Output will vary each time the program is executed. Notice in this example that the same type of die, d8, appears twice. This can happen because each of the five dice is randomly chosen. It is possible to have multiple die of the same type appear in the output.

## Under the Hood
This project is from an assignment for my CS232 (Java) class. Essentially, this assignment was the first program of the class to solidify knowledge of object-oriented-programming concepts. Assignments before this one had no classes or object, opting instead to do everything within the main method.

There are two class files used in the program. One class file, Lab5, is the driver of the program and contains the logic of the program. The other class file is 'Die.class', which contains the class definition for the Die class.

**Die.class:**

This class definition is able to create 'Die' objects with any number of faces. It holds data for the type of die, and the current face value. There is a method to roll the dice, which will randomly choose a value for the face value. 

**Lab5.class (Driver)**

This driver contains the main logic that makes the program work. Two array lists are made, one to house the 5 objects of the Die class, and the other a list of the different types of D&D dice (e.g. 'D4').

A for loop runs five times for each die. The type of dice is randomly chosen using the `Math.random()` function. The roll method is called, and the info from the current Die object is outputted to the console.
## What I Have Learned
This assignment has helped me to solidify my understanding of some of the basic principles of object-oriented-programming. I made use of 'this.' in the constructor to explicitly refer to the instance fields in the class definition. I got experience in writing common methods found in many classes, such as 'accessor' methods and the `toString()` method.
