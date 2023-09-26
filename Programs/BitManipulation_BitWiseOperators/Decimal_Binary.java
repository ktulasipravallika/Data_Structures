package BitManipulation_BitWiseOperators;

import java.util.Scanner;

public class Decimal_Binary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter any number to convert the decimal number to binary number : ");
        int x = scan.nextInt();

        String dec = decimaBin(x);
        System.out.println("The binary number is "+ dec);

        System.out.println("The decimal Number is :"+ binToDec(dec));

        scan.close();
    }

    static String decimaBin(int n){

        String binary = "";
        while(n>=1){
            binary= (n%2) + binary;
            n = n/2;
        }
        return binary;

    }

    static int binToDec(String str){
        int result = 0;
        int powOf2 = 1;

        for(int i = str.length()-1 ; i >=0 ; i--){

            if(str.charAt(i)== '1'){
                result = result + powOf2;
            }
            powOf2 = powOf2 * 2;
        }
        return result;
    }
}
