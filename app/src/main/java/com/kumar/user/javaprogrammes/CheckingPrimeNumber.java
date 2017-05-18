package com.kumar.user.javaprogrammes;

import java.util.Scanner;

/**
 * Created by User on 5/9/2017.
 */

public class CheckingPrimeNumber {
    public static void main(String[] args) {
        int temp;
        boolean isPrime=true;
        Scanner scanner= new Scanner(System.in);
        int num=scanner.nextInt();
        for (int i=2;i<=num/2;i++){
            temp=num%2;
            if (temp==0){
                isPrime=false;
            }
        }
        if (isPrime){
            System.out.println(num + "is prime number");
        }
        else {
            System.out.println(num + "is not a prime number");
        }
    }
}
