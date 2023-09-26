import java.util.Scanner;

public class PowOf2_KerniganAlg {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter any number to find if it is power of 2 or not :");
        int num = scan.nextInt();

        System.out.println("The number is prime :" + powOf2OrNot(num));
        scan.close();
    }

    public static boolean powOf2OrNot(int num) {
        return num!=0 ? (((num & (num - 1)) == 0) ? true : false) : false;
    }
}
