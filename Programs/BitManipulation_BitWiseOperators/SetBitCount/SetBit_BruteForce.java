package BitManipulation_BitWiseOperators.SetBitCount;

import java.util.Scanner;

public class SetBit_BruteForce {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number :");
        int n = scan.nextInt();

        String binary = decimaBin(n);
        int count =0;

        for(int i = binary.length() - 1 ; i >=0 ; i--){
            if(binary.charAt(i)== '1'){
                count++;
            }
        }
        System.out.println("The count is :" + count);
        
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

}
