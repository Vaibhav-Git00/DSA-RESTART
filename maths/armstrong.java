package maths;

import java.util.Scanner;

public class armstrong {
    public static boolean check(int n){
        int arm=0;
        int dup=n;
        while(n>0){
            int digit = n%10;
            arm = arm + (digit*digit*digit);
            n=n/10;
        }
        if(arm == dup){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        int n=sc.nextInt();
        if(check(n)){
            System.out.print("this is a Armstrong number");
        }else{
            System.out.println("this is not a armstrong number");
        }
    }
}
