package com.kumar.user.javaprogrammes;

import java.util.Scanner;

/**
 * Created by User on 5/9/2017.
 */

public class DisplayPrimeNumbersFrom1Ton {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        int num = 0;
        String primeNumbers = "";
        System.out.println("Enter the Prime Number to display:");
        int n = scanner.nextInt();
        for (i = 1; i <= n; i++) {
            int counter = 0;
            {
                for (num = i; num >= 1; num--) {
                    if (i % num == 0) {
                        counter = counter + 1;
                    }
                }
                if (counter == 2) {
                    primeNumbers = primeNumbers + i + " ";
                }
            }
        }
        System.out.println("prime numbers from 1 to n are:");
        System.out.println(primeNumbers);
    }
}
