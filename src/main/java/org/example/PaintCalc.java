/*
 *  UCF COP3330 Summer 2021 Assignment 9 Solution
 *  Copyright 2021 Quentin_Burney
 */
package org.example;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class PaintCalc {
    public static void main(String[] args){
        int reallength;
        int realwidth;
        int area=0;
        int gallons=0;
        System.out.println("What is the length of the room in feet?");
        Scanner scanner = new Scanner(System.in);
        String length = scanner.next();
        System.out.println("What is the width of the room in feet?");
        Scanner scanner1 = new Scanner(System.in);
        String width = scanner.next();
        reallength = parseInt(length);
        realwidth = parseInt(width);
        System.out.println("You entered dimensions " + reallength + " feet by " + realwidth + " feet.");
        area = reallength * realwidth;
        gallons = (350 / area ) * 100;
        Math.ceil(gallons);
        System.out.println("You will need to purchase " + gallons + " gallons of paint to cover " + area +" square feet.");

    }
}
