package org.amazon;

import java.util.Scanner;

public class Calculator {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter first number:");
            int num1 = sc.nextInt();
            System.out.println("Enter second number:");
            int num2 = sc.nextInt();

            int sum = num1 + num2;

            int difference = num1 - num2;

            int multiply = num1 * num2;
            int division= num1/num2;
            int reminder= num1 % num2;

            System.out.println("First number: " + num1);
            System.out.println("Second number: " + num2);
            System.out.println("Sum: " + sum);
            System.out.println("Subtraction: " + difference);
            System.out.println("multiplication:"+multiply);
            System.out.println("Division:" + num1/num2);
            System.out.println("reminder:" + reminder);
            System.out.println("Hi Sai");
        }
        public void sai(){
            System.out.println("Hi Sai");
        }
    }

