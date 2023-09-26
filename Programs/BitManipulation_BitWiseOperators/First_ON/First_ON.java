package BitManipulation_BitWiseOperators.First_ON;

import java.util.Scanner;

public class First_ON {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number :");
        int n = scan.nextInt();

        System.out.println("The First On position is : " + (1 + (int)(Math.log10((n ^ (n & (n-1))))/Math.log10(2))));

        scan.close();
    }

    //Time Complexity is : O(1)
} 
