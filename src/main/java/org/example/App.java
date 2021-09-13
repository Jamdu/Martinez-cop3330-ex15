/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Joshua Martinez
 */
package org.example;

import java.util.Scanner;

public class App
{

    public static void main( String[] args )
    {
        Scanner scnr = new Scanner(System.in);

        String phrase = "abc$123";
        System.out.println("Enter username please: ");
        String username = scnr.nextLine();
        System.out.println("What is the password?");
        String pass = scnr.nextLine();

        if (pass.equals(phrase))
        {
            System.out.println("Welcome " + username + "!");
            System.exit(0);
        }
        else {
            System.out.println("You Shall Not Pass!!!!");
            System.exit(0);
        }
    }
}
