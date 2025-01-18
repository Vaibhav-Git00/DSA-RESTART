package recursion;


public class ntoone {
    public static void print(int i,int n){
        if(i>n){
            return ;
        }
        
        print(i+1, n);
        System.out.print(i+" "); //this is a backtracking process

    }

    public static void main(String[] args) {
     int n=5;
     print(1, n);
   

    }
}