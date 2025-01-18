package recursion;

public class firstnNumbers {
    public static void first(int n,int sum){
        if(n<1){
            System.out.println(sum);
            return ;
        }
        first(n-1, sum+n);
    }
    public static void main(String[] args) {
        int n=5;
        int sum=0;
        first(n,sum);
    }
}
