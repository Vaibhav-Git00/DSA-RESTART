package maths;

import java.util.Scanner;

public class counter {

    public static int counting(int n){
        int count=0;
        while(n>0){
            count++;
            n=n/10;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();

        int result=counting(n);
        System.out.println(result);
        sc.close();
    }
}
