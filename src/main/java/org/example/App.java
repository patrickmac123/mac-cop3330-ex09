package org.example;
import java.util.Scanner;
import java.text.DecimalFormat;


/*
 *  UCF COP3330 Fall 2021 Assignment 1 Exercise 9 Solution
 *  Copyright 2021 Patrick Mac
 */

public class App
{
    private static final int oneGallon = 350;
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        System.out.print( "What is the length of the room in feet? " );
        String stringLength = scan.nextLine();
        System.out.print( "What is the width of the room in feet? " );
        String stringWidth = scan.nextLine();

        double length = Double.parseDouble(stringLength);
        double width = Double.parseDouble(stringWidth);

        double area = length * width;

        double paint = Math.ceil(area / oneGallon);


        DecimalFormat decimalFormat = new DecimalFormat("0.#####");
        String result = decimalFormat.format(Double.valueOf(paint));
        System.out.println("You will need to purchase "+result+" gallons of paint to cover "+area+" square feet. ");
    }
}