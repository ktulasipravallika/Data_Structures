
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter any two number tofind the LCM and GCD :");
        int x = scan.nextInt();
        System.out.println("Factorial of the given number is :" + factorial(x));
        scan.close();
    }

    public static int factorial(int x){
        int factorial = 1;

        for(int i = 1 ; i <= x ; i++){
            factorial = factorial * i;
        }
        return factorial;
    }
    
}
