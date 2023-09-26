package BitManipulation_BitWiseOperators;

import java.util.Scanner;

public class BitMasking_Off {

    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);

        System.out.println("Enter the number :");
        int n = scan.nextInt();

        System.out.println("Enter the value to switch-off");
        int i = scan.nextInt();

        int onMask = ~(1 << i);
        int dec = (n & onMask);
        System.out.println("The number is :"  + dec);

        String binary = "";

        while(dec>=1){
            dec = dec/2;
            binary = (dec % 2) + binary;
        }
        System.out.println("Binary Number is : " + binary);
        scan.close();
    }
    
}
