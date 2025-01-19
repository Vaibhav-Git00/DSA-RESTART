package recursion;

public class firstnNumbers {
    // public static void first(int n,int sum){
    //     if(n<1){
    //         System.out.println(sum);
    //         return ;
    //     }
    //     first(n-1, sum+n);
    // }
    public static int first(int n){
        if(n==0){
            return 0;
        }
        return n+first(n-1);    //this is called functional recursion
    }
    public static void main(String[] args) {
        int n=5;
        // int sum=0;
        // first(n,sum);
        int result=first(n);
        System.out.println(result);
    }
}
