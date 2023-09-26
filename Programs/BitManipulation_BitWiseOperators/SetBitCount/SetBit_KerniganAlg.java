package BitManipulation_BitWiseOperators.SetBitCount;

import java.util.Scanner;

public class SetBit_KerniganAlg {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter any number :");
        int num = scan.nextInt();

        System.out.println("The number of bits set is : " + countBitSet(num));
        scan.close();
    }

    public static int countBitSet(int num){
        int count = 0;
        while(num!=0){
            int newNum = num & (num - 1);
            num = newNum;
            count++;
        }
        return count;
    }

    //Time Complexity : O(log(N))
}
