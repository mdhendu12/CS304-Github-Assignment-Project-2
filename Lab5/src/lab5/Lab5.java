/*
Name: Matthew Henderson
Class: CS 232-001
Program: Lab 5 - This program creates and rolls 5 randomly selected
        'Dungeons & Dragons' dice. Dice choices in D&D are
        (d4, d6, d8, d10, d12, d20, and d100). The random results are
        displayed to the user.
             
Due Date: 9/26/2021
*/
package lab5;
public class Lab5 {
    public static void main(String[] args) {
        // Integer variable for type of dice declared here
        int typeOfDice;
        
        // Two array lists are created here. One creates an array to hold 5 'Die' objects.
        // The other, diceList, creates a list of types of die according to how many faces it has.
        Die[] diceObjects = new Die[5];
        int[] diceList = {4, 6, 8, 10, 12, 20, 100};
        
        // For loop iterates 5 times for each of the five die choices
        for (int i = 0; i < 5; i++) {
            // typeOfDice is given a random integer value from 0-6 (representing indices for diceList)
            typeOfDice = (int)(Math.random() * 7);

            // new Die object created. 
            // Argument given to constructor is a value from diceList 
            // (index of 'diceList' is given the random val stored in typeOfDice)
            diceObjects[i] = new Die(diceList[typeOfDice]);
            
            // Roll method of Die object at index 'i' for diceObjects is called.
            // Then sys prints the return value of the 'toString' method call for die object at index 'i' for diceObjects.
            diceObjects[i].roll();
            System.out.print(diceObjects[i].toString());
            
            // If-else structure for output formatting. 
            // At the last iteration, program closes with a whitespace instead of a comma.
            if (i != 4) {
                System.out.print(", ");
            }
            else {
                System.out.print(" ");
            }
        }
    }   
}
