//print the subsequence whosw sum is equal to k

package recursion;

import java.util.ArrayList;

public class subsequenceSum {
    public static void subseeSum(int arr[],int indx,ArrayList<Integer>ans,int k,int sum){
        if(indx==arr.length){
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

        subseeSum(arr,indx+1,ans,k,sum);
        
        ans.remove(ans.size()-1);
        sum -=arr[indx];
        
        //non - take 
        subseeSum(arr, indx+1, ans, k,sum);

       
    }
    public static void main(String[] args) {
        int arr[]={1,2,1};
        int k=2;
        ArrayList<Integer> ans=new ArrayList<>();
        subseeSum(arr, 0, ans, k,0);
    }
}



//count the subsequence the sum is equal to k 
// package recursion;

// import java.util.ArrayList;

// public class subsequenceSum {
//     public static int subseeSum(int arr[], int indx, ArrayList<Integer> ans, int k, int sum, int n) {
//         if (indx == n) {
//             if (sum == k) {
//                 return 1; // Count this subsequence
//             }
//             return 0; // No valid subsequence
//         }

//         // Take the current element
//         ans.add(arr[indx]);
//         sum += arr[indx];
//         int takeCount = subseeSum(arr, indx + 1, ans, k, sum, n);
//         ans.remove(ans.size() - 1); // Backtrack
//         sum -= arr[indx];

//         // Don't take the current element
//         int notTakeCount = subseeSum(arr, indx + 1, ans, k, sum, n);

//         // Return total count
//         return takeCount + notTakeCount;
//     }

//     public static void main(String[] args) {
//         int arr[] = {1, 2, 1};
//         int n = 3;
//         int k = 2;
//         ArrayList<Integer> ans = new ArrayList<>();
//         int count = subseeSum(arr, 0, ans, k, 0, n);
//         System.out.println(count);
//     }
// }
//////