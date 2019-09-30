package com.company;

import java.util.Scanner;

public class q8 {
    public static void main(String[] args) {
        System.out.println("Select the type of exception you want to generate");
        System.out.println("1.NegativeArraySizeException");
        System.out.println("2.IndexOutOfBoundsException");
        System.out.println("3.NullPointerException");

        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int [] arr1={0,1};

        switch (num1) {
            case 1:
                try {
                    int[] arr2 = new int[-2];
                } catch (NegativeArraySizeException e) {
                    System.out.println("Negative array Size");
                }
                break;
            case 2:
                try {
                    System.out.println(arr1[2]);
                } catch (IndexOutOfBoundsException i) {
                    System.out.println("out of bound");
                }
                break;
            case 3:
                try {
                    int a = 5;
                    int b = 0;
                    int c = a / b;

                } catch (ArithmeticException ae) {
                    System.out.println("Divide by zero");
                }
        }
    }
}
