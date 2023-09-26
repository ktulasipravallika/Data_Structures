package BitManipulation_BitWiseOperators;

import java.util.Scanner;

public class checkmask {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number :");
        int n = scan.nextInt();

        System.out.println("Enter the position to toggle :");
        int i = scan.nextInt();

        int maskPos = (1 << i);
        String dec = ((n & maskPos)>0)? "ON":"OFF";
        System.out.println("The number after toggle is : " + dec);
       
        scan.close();
    }
}
