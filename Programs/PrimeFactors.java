import java.util.Scanner;

public class PrimeFactors {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter any two number tofind the LCM and GCD :");
        int x = scan.nextInt();
        System.out.println("Prime Factors of the given number are :");
        primeFac(x);
        scan.close();
    }

    public static void primeFac(int n) {
        int num = n;
        int i = 2;

        while (i <=Math.sqrt(num)) {        //sqrt(n)
            while (num % i == 0) {          //when a value gets divided then the loops runs for Log(n) times
                System.out.println(i);
                num = num / i;
            }
            i++;
        }
        if(n>1)
            System.out.println(n);
    }

    // Time Complexity : sqrt(n) + sqrt(n). log(n) = O(sqrt(n))
}
