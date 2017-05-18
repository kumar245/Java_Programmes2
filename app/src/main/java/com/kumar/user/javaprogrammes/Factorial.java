package com.kumar.user.javaprogrammes;

import java.util.Scanner;

/**
 * Created by User on 5/12/2017.
 */

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Factorial Number:");
        int num = scanner.nextInt();

        int factorial=fact(num);

    }
    public static int fact(int n){
        if (n == 1) {
            return 1;
        }

        int output= fact(n-1)*n;
        return output;

    }
}
