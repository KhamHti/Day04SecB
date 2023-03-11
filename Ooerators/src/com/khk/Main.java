package com.khk;

import java.sql.SQLOutput;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        int a = 5, b = 2;
//
//        double divA = 2;
//        int divB = 0;
//
//        int c = a + b;
//        System.out.println("The answer is " + c);
//
//        String myName = "Kaung Htet Kyaw";
//        System.out.println("My name is " + myName);
//
//        System.out.println("The answer is " + (a-b));
//
//        System.out.println("The answer is " + (a*b));
//
//        System.out.println("The answer is " + (divA/divB));
//
//        System.out.println("The answer is " + (a%b));

//        int a = 2;
//        int b = 2;
//
////        a--; // a = a - 1;
//        a+=b;
//        System.out.println(a);
//
//        a-=b; // a = a - b
//        System.out.println(a);
//
//        a*=b;
//        System.out.println(a);
//
//        a/=b;
//        System.out.println(a);
//
//        a%=b;
//        System.out.println(a);
//
//        int a = 1, b = 2, c = 3, d = 4, e = 5, f = 6;
//        //  OR
//        if (a >= b) {
//            System.out.println("True");
//        }
//        System.out.println("False");

        Date date = new Date();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age.");
        if (scanner.hasNextInt()) {
            System.out.println("Your age is " + scanner.nextInt() +" years old.");
        }else if(scanner.hasNextFloat()) {
            System.out.println("Your age in float is " + scanner.nextFloat() + " years old.");
        }else {
            System.exit( 0);
        }
        System.out.println("Finish");
    }
}
