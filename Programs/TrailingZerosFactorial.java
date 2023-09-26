import java.util.Scanner;

public class TrailingZerosFactorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter any number to find the trailing zeroes in a number :");
        int x = scan.nextInt();
       
        System.out.println("The Trailing Zeros of factorial of the given number is :" + trailingZeros(x));
        System.out.println("The factorial of the given number is :" + factorial(x));
        scan.close();
    }

    public static int trailingZeros(int x) {

        int powOf5 = 5;
        int result = 0;

        while (x >= powOf5) {
            result = result + x / powOf5;
            powOf5 = powOf5 * 5;
        }

        return result;
    }

    public static double factorial(int x){
        double factorial = 1;

        for(int i = 1 ; i <= x ; i++){
            factorial = factorial * i;
        }
        return factorial;
    }

}
