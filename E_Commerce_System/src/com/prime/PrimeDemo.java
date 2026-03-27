package com.prime;

import java.util.Scanner;

class PrimeDemo{

    public static void isPrime(int n){
        if (n<=1) {
            System.out.println("Number is not prime number");
        }
        if (n == 2) {
            System.out.println("Number is prime");
        }
        else{
            for(int i=3; i<=n ; i++){
                if (n%i == 0) {
                    System.out.println("Number is not prime");
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        isPrime(num);
    }
}
