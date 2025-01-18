package recursion;

public class nameprint {
    public static void printing(int i,int n){
        if(i>n){
            return ;
        }
        System.out.print("Ram ");
        printing(i+1, n);
    }
    public static void main(String[] args) {
        int n=4;
        printing(1,n);
    }

}
