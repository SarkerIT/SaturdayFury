package com.upskill.assignment_2;

//Write a java program to find the prime number from 1 to 100 and print them.

public class Problem_6_ChatGPT_1 {
    public static void main(String[] args) {
        System.out.println("Prime numbers from 1 to 100:");
        for (int num = 1; num <= 100; num++) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
    }

    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false; // 0 and 1 are not prime numbers
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // Number is divisible by i, hence not prime
            }
        }
        return true; // Number is prime
    }
}

/*
Reasons for Using Math.sqrt(i):
Divisibility Rules: A number iii can only have factors up to its square root. If iii has a divisor larger than its square root, the corresponding factor must be smaller than the square root. For example, if i=36i = 36i=36, its factors are 1, 2, 3, 4, 6, 9, 12, 18, and 36. The largest factor before 36 is 6, which is the square root of 36.
Efficiency: By checking for factors only up to the square root of iii, you significantly reduce the number of iterations. This brings down the time complexity from O(n)O(n)O(n) to O(n)O(\sqrt{n})O(n) for each number, which can greatly improve performance, especially for larger numbers.
Lower Computational Cost: For large numbers, iterating up to i−1i - 1i−1 can be computationally expensive. Checking only up to i\sqrt{i}i makes the algorithm faster and more efficient without sacrificing correctness.



  
 
 */


