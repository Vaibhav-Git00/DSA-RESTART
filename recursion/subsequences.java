package recursion;

import java.util.ArrayList;

public class subsequences {
    public static void subseee(int arr[],int indx, ArrayList<Integer>v){
       
        int n=arr.length;
        if(indx==n){
            for(int i=0;i<v.size();i++){
                System.out.print(v.get(i));
            }
            System.out.println();
            return ;
        }
        v.add(arr[indx]);
        subseee(arr, indx+1,v); 
         v.remove(v.size()-1);

        subseee(arr, indx+1,v);


    }
    public static void main(String[] args) {
        int arr[]={1,2,3};
        ArrayList<Integer>v=new ArrayList<>();
        subseee(arr, 0,v);

    }
}
