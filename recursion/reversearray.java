package recursion;

public class reversearray {
    public static void reversing(int arr[],int l,int r){
        if(l>=r){
            return ;
        }
        int temp=arr[l];
        arr[l]=arr[r];
        arr[r]=temp;
        reversing(arr, l+1, r-1);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int l=0;
        int r=arr.length-1;
        reversing(arr,l,r);
        for(int num: arr){
            System.out.print(num+" ");
        }
    }
}
