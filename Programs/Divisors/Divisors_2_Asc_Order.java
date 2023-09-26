package Divisors;

import java.util.Scanner;

public class Divisors_2_Asc_Order {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter any number to find the all the divisors of the given number : ");
        int x = scan.nextInt();

        divisors(x);

        scan.close();
    }

    public static void divisors(int n) {
        System.out.println(" The divisors of the given number are : ");
        int i = 0;
        for (i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }
        for (; i >= 1; i--) {
            if (n % i == 0 && n / i != i) {
                System.out.println(n/i);
            }
        }
    }
    // Time Complexity : O(sqrt(n))
}
