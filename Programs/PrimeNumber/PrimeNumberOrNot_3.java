package PrimeNumber;
import java.util.Scanner;

public class PrimeNumberOrNot_3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter any number to find if the number is prime or not : ");
        int x = scan.nextInt();

        String isPrime = isPrime(x)? "Prime Number":"Non_Prime_Number" ;

        System.out.println("Factorial of the given number is :" +isPrime);
        scan.close();
        
    }

    public static boolean isPrime(int x) {
        for (int i = 2 ; i <= Math.sqrt(x) ; i++){           /* sqrt(n)  */
            if(x%i == 0)
                return false;
        }
        return true;
    }
    

    /* Time Complexity is O(sqrt(n)) */
}
