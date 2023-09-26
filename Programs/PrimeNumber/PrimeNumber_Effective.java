package PrimeNumber;

import java.util.Scanner;

public class PrimeNumber_Effective {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter any number to find if the number is prime or not : ");
        int x = scan.nextInt();

        String isPrime = isPrime(x) ? "Prime Number" : "Non_Prime_Number";

        System.out.println("Factorial of the given number is :" + isPrime);
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

    //Time Complexity : O(sqrt(n))
}
