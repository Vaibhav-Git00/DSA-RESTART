package recursion;

public class factorial {
    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        return n*factorial(n-1);
    }
    public static void main(String[] args) {
        int n=3;
        int result=factorial(n);
        System.out.println(result);

    }
}
