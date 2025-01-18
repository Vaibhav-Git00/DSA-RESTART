package recursion;

import java.util.*;

public class oneton {
    public static void print(int i,int n){
        if(i<1){
            return ;
        }
        print(i-1, n);
        System.out.print(i+" "); //this is also a backtraking 

    }

    public static void main(String[] args) {
     int n=5;
     print(n, n);
   

    }
}