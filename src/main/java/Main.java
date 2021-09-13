/*
 *  UCF COP3330 Fall 2021 Assignment 14 Solution
 *  Copyright 2021 Christine Hawkins
 */
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("What is the order amount? ");
        double amount = input.nextDouble();

        System.out.println("What is the state? ");
        String state = input.next();
        double tax=0;

        if(state.equals("WI"))
        {
            tax=0.55;
            System.out.printf("The subtotal is:$%.2f.%n",amount);
            System.out.printf("The tax is $%.2f.%n", tax);

        }
        double total= amount+tax;
        System.out.printf("The total is: $%.2f. %n",total);
    }
}

