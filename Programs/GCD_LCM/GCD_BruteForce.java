package GCD_LCM;

import java.util.Scanner;

public class GCD_BruteForce {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two number to find GCD : ");
        int x = scan.nextInt();
        int y = scan.nextInt();

        System.out.println("The GCD of the given two numbers is : " + gcd(x, y));
        scan.close();

    }

    public static int gcd(int x, int y){
       int min = (x<y) ? x : y;
       for(int i = min ; i >=1 ; i --){
        if((x%i==0) && (y%i==0)){
            return i;
        }
       }
       return 1;
    }
}
