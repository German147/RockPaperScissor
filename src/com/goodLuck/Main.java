package com.goodLuck;
/*it is a practice to implement the scanner, and random classes, the use of  System.out.println
and the if else conditional*/
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //here we take the user's choice
        System.out.println("Let's Play Rock Paper and Scissor");
        System.out.println("Enter your Choice writing the number=> Rock (1), Paper(2) and Scissor(3)");
        //now we store that input into a variable
        int i;
        Scanner sc = new Scanner(System.in);
        i = sc.nextInt();
        /*lets suposse the following choices..
          i=1 Rock
          i=2 Paper
          i=3 Scissor*/

        Random ran = new Random();
        //here the choice is up to three due to the bound selected as 3
        int computer_choice = ran.nextInt(3) + 1;

        if (computer_choice == 1) {//computer has selected Rock
            System.out.println("The computer has selected Rock");
            if (i == 1) {
                System.out.println("It is tie");
            } else if (i == 2) {//if you chose Paper
                System.out.println("You Win!");
            } else if (i == 3) {//if you chose Scissor
                System.out.println("You Lose!");
            }
        } else if (computer_choice == 2) {//computer has selected Paper
            System.out.println("The computer has selected Paper");
            if (i == 1) {//if you chose Rock
                System.out.println("You Lose");
            } else if (i == 2) {//if you chose Paper
                System.out.println("It is tie!");
            } else if (i == 3) {//if you chose Scissor
                System.out.println("You Win!");
            }
        } else if (computer_choice == 3) {//computer has selected Scissor
            System.out.println("The computer has selected Scissor");
            if (i == 1) {//if you chose Rock
                System.out.println("You Win");
            } else if (i == 2) {//if you chose Paper
                System.out.println("You Lose!");
            } else if (i == 3) {//if you chose Scissor
                System.out.println("It is a Tie!");
            }
            System.out.println("Thanks For Playing, Good Bye!");
        }
    }
}
