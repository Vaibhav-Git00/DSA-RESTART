package recursion;

public class fabbinocci {
    public static int fabbi(int n){
        if(n==0||n==1) return n;
        return fabbi(n-1)+fabbi(n-2);
    }
    public static void main(String[] args) {
        int n=4;
        int result=fabbi(n);
        System.out.println(result);
       
    }
}
