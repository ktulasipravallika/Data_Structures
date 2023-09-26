package PrimeNumber;

import java.util.Scanner;

public class PrimeOrNot_2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter any number to find if the number is prime or not : ");
        int x = scan.nextInt();

        String isPrime = isPrime(x)? "Prime Number":"Non_Prime_Number" ;

        System.out.println("Factorial of the given number is :" +isPrime);
        scan.close();
        
    }

    public static boolean isPrime(int x) {
        for (int i = 2 ; i < x/2 ; i++){        //n/2
            if(x%i == 0)                        //n/2 -1
                return false;                   //1
        }
        return true;                            //1
    }

    // n/2 + n/2 -1 +1 = 2n/2 = n
    //Time Complexity = O(n)

}
