package recursion;

import java.util.ArrayList;

public class subsequenceSum {
    public static void subseeSum(int arr[],int indx,ArrayList<Integer>ans,int k,int sum,int n){
        if(indx==n){
            if(sum==k){
                for(int i=0;i<ans.size();i++){
                    System.out.print(ans.get(i)+" ");
                }
                System.out.println();
            }
            return;
        }

        //take 
        ans.add(arr[indx]);
        sum +=arr[indx];

        subseeSum(arr,indx+1,ans,k,sum,n);
        
        ans.remove(ans.size()-1);
        sum -=arr[indx];
        
        //non - take 
        subseeSum(arr, indx+1, ans, k,sum,n);

       
    }
    public static void main(String[] args) {
        int arr[]={1,2,1};
        int n=3;
        int k=2;
        ArrayList<Integer> ans=new ArrayList<>();
        subseeSum(arr, 0, ans, k,0,n);
    }
}