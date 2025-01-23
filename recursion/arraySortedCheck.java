package recursion;

public class arraySortedCheck {
    public static boolean check(int arr[],int indx){
        if(indx==arr.length-1||arr.length==0){
            return true;
        }
        if(arr[indx]>arr[indx+1]){
            return false;
        }
        return check(arr, indx+1);
        

    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        boolean result =check(arr, 0);
        System.out.println(result);

    }
}
