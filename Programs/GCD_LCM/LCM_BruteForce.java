package GCD_LCM;

import java.util.Scanner;

public class LCM_BruteForce {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two numbers to find LCM : ");
        
        int x = scan.nextInt();
        int y = scan.nextInt();
        System.out.println("The LCM of the given two numbers is : " + lcm(x, y));
        scan.close();
    }

    public static int lcm(int x, int y){
        int max = (x>y) ? x : y;

        while(true){
            if(max%x==0 && max%y==0){
                break;
            }
            max++;
        }
        return max;
    }
    
}
