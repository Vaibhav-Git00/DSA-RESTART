package maths;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n= sc.nextInt();
        int dup=n;
        int revs=0;
        while (n>0){
            int digit = n%10;
            revs=(revs*10)+digit;
            n=n/10;
        }
        if(revs==dup){
            System.out.println("palindrome");
        }else{
            System.out.println("not a palindrome");
        }
        sc.close();

    }
}
