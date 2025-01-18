package maths;

import java.util.Scanner;

public class reverse {
    public static int reversing(int n){
        int revs=0;
        while(n>0){
            int digit =n%10;
            revs=(revs*10)+digit;
            n=n/10;
        }
        return revs;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int result=reversing(n);
        System.out.println(result);
    }
}
