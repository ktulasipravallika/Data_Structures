package PrimeNumber;

import java.util.Scanner;

public class PrintPrimeNumber_2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter any number to find the number prime numbers in between 1 and the given number : ");
        int x = scan.nextInt();
        printPrimeNum(x);
        scan.close();

    }

    public static void printPrimeNum(int n) {

        boolean[] val = new boolean [n+1];

        for (int i = 2; i <= Math.sqrt(n) ; i++) {
            if(val[i] == false){
                for(int j = i*i; j <=n ; j=j+i ){  /*for(int j = (i*2); j <=n ; j=j+i ){*/
                    val[j] = true;
                }
            }
        }

        for(int i = 2; i <=n; i++){
            if(val[i]==false){
                System.out.println(i);
            }
        }
    }
} // Time Cmplexity is O(sqrt(n).log(log(n)))
