package PrimeNumber;

import java.util.Scanner;

public class PrimeOrNot_BruteForce {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter any number to find if the number is prime or not : ");
        int x = scan.nextInt();

        System.out.println("Factorial of the given number is :" + isPrime(x));
        scan.close();
        
    }

    public static boolean isPrime(int x) {
        for (int i = 2 ; i < x ; i++){
            if(x%i == 0)
                return false;
        }
        return true;
    }
    
    //Time Complexity = O(n)
}
