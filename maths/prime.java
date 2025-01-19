package maths;

public class prime {
    public static boolean prim(int n){
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==2){
            return true;
        }else{
            return false;
        }
    }
    //ANOTHER way
    public static String isPrime(int num) {
		if(num<=1){
			return "NO";
		}
		for(int i=2;i*i<=num;i++){
			if(num%i==0){
				return "NO";
			}
		}
		return "YES";
	}
    public static void main(String[] args) {
        int n=11;
        if(isPrime(n)=="YES"){
            System.out.println("this is a prime number");
        }else{
            System.out.println("this is not a prime number");
        }
    }
}
