package Divisors;

import java.util.Scanner;

public class Divisors_BruteForce {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter any number to find the all the divisors of the given number : ");
        int x = scan.nextInt();

        divisors(x);
        
        scan.close();
    }

    public static void divisors(int n){
        System.out.println(" The divisors of the given number are : ");
        for(int i = 1; i <= n ; i++){
            if(n%i==0)
                System.out.println(i);
        }
    }

    //Time Complexity is : O(n)
}
