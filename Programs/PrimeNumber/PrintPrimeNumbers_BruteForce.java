package PrimeNumber;

import java.util.Scanner;

public class PrintPrimeNumbers_BruteForce {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter any number to find the number prime numbers in between 1 and the given number : ");
        int x = scan.nextInt();
        printPrimeNum(x);
        scan.close();

    }

    public static boolean isPrime(int x) {

        if (x == 1)
            return false;
        if (x == 2 || x == 3)
            return true;
        if (x % 2 == 0 || x % 3 == 0)
            return false;

        for (int i = 5; i <= Math.sqrt(x); i = i + 6) {
            if (x % i == 0 || x % (i + 2) == 0)
                return false;
        }
        return true;
    }


    public static void printPrimeNum(int n){
        for(int i = 0; i < n; i++){                         //--- n 
            if(isPrime(i)){                                //--- n*sqrt(n)
                System.out.println(i);                     //---1
            }
        }
    }        //Time Cmplexity is n*sqrt(n)
}
