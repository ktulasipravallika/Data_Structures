package BitManipulation_BitWiseOperators;

import java.util.Scanner;

public class Toggle {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number :");
        int n = scan.nextInt();

        System.out.println("Enter the position to toggle :");
        int i = scan.nextInt();

        System.out.println("The binary number before toggle is : " + binary(n));

        int maskPos = (1 << i);
        int dec = (n ^ maskPos);

        System.out.println("The number after toggle is : " + dec);
       
        System.out.println("Binary Number is : " + binary(dec));
        scan.close();
    }

    public static String binary(int n){

        String binary= "";
        while(n>=1){
            n = n/2;
            binary = (n % 2) + binary;
        }
        return binary;

    }
}
