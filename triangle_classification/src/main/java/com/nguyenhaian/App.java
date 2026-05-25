package com.nguyenhaian;

import java.util.Scanner;


public class App 
{
    public static void main( String[] args )
    {
        Scanner reader = new Scanner(System.in);

        int a = reader.nextInt();
        int b = reader.nextInt();
        int c = reader.nextInt();

        reader.close();

        Boolean inputValid = checkInputValidity(a, b, c);
        if (inputValid) {
            System.out.println(classifyTriangle(a, b, c));
        } else {
            System.out.println("Invalid Input");
        }
    }

    private static Boolean checkInputValidity (int a, int b, int c) {
        return 1 <= a && a <= 100 && 1 <= b && b <= 100 && 1 <= c && c <= 100;
    }

    private static String classifyTriangle (int a, int b, int c) {
        if (a + b <= c || a + c <= b || b + c <= a) {
            return "Not a Triangle";
        }
        
        if (a == b && a == c && b == c) {
            return "Equilateral";
        }

        if ((a == b && a != c)
            ||(b != c && a == c)
            ||(a != b && b == c)) {
            return "Isosceles";
        }

        return "Scalene";
    }
}
