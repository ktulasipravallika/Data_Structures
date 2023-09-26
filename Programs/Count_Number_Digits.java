import java.util.Scanner;

public class Count_Number_Digits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter anynumber to count the number of digits :");
        int x = scan.nextInt();
        System.out.println("The count of number of digits in the given number is : " +countDigits(x));
        scan.close();
    }

    public static int countDigits(int x){

        int count = 0;
            while(x > 0){
                x = x/10;
                count++;
            }
        return count;

    }
}
