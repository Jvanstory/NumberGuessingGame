/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numberguessinggame;

import java.util.Scanner;


/**
 *
 * @author joeva
 */
public class NumberGuessingGame {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        //Creates a random number from 1 to 100
        int ran = 1 + (int)(100 * Math.random());
        int guess; 
        
        System.out.println("Guess the number from 1 - 100");
        
        for (int i = 1; i < 102; i++){
            System.out.println("Input guess number " + i);
            guess = scnr.nextInt();
            
            if (guess == ran){
                System.out.println("CONGRADULATIONS!!! You guessed correctly The number was " + ran);
                break;
            } else if (guess > ran){
                System.out.println("The number you guessed was larger than the number");
            } else {
                System.out.println("The number you guessed was smaller than the number");
            }
            
        }
        
    }
}
    