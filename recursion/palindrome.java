package recursion;

public class palindrome {
    public static boolean palin(int i,String s){
        int n=s.length();
        if(i>=n/2){
            return true;
        }
        if(s.charAt(i)!=s.charAt(n-i-1)){
            return false;
        }
        return palin(i+1, s);
    }
    public static void main(String[] args) {
        String s="madam";
        boolean result=palin(0, s);
        System.out.println("this is "+result+" palindrome");

    }
}
 