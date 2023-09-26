import java.util.Scanner;

public class PowOf2OrNot_bruteForce {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter any number to find if it is power of 2 or not :");
        int num = scan.nextInt();

        System.out.println("The number is prime :" +powOf2OrNot(num));
        scan.close();      
    }

    public static boolean powOf2OrNot(int num){
        String binary = decimaBin(num);
        int count = 0;
        for(int i = 0 ; i < binary.length() ; i++){
            if(binary.charAt(i)=='1')
                count++;
        }
        return count == 1? true : false;
    }


    public static String decimaBin(int n){

        String binary = "";
        while(n>=1){
            binary= (n%2) + binary;
            n = n/2;
        }
        return binary;
    }
}
