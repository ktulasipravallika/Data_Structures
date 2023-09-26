package BitManipulation_BitWiseOperators.First_ON;

import java.util.Scanner;

public class FirstOn_bruteForce {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number :");
        String n = scan.nextLine();

        for (int i = n.length() - 1; i >= 0; i++) {
            if (n.charAt(i) == '1') {
                System.out.println(i + 1);
                break;
            }
        }
        //System.out.println("No switch is ON");
        scan.close();
    }
}
