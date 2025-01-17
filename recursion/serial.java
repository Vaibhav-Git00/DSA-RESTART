package recursion;

import java.util.*;

public class serial {
    public static void print(int cnt){

        if(cnt<0) return;
        
        System.out.println(cnt);
        cnt--;
        print(cnt);

    }

    public static void main(String[] args) {
        // Scanner sc  =new Scanner(System.in);
        // int n=sc.nextInt();
        print(3);

    }
}