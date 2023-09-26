package GCD_LCM;

import java.util.Scanner;

public class GCD_TwoNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two number to find GCD : ");
        int x = scan.nextInt();
        int y = scan.nextInt();

        System.out.println("The GCD of the given two numbers is : " + gcd(x, y));
        scan.close();

    }

    public static int gcd(int x, int y) {

        while (x != 0 && y != 0) {
            if (x > y) {
                x = x % y;
            } else if (y > x) {
                y = y % x;
            }
        }
        return (x!=0) ? x : y;
    }

}
