package hashmapp;

import java.util.HashMap;
import java.util.HashSet;

public class hash {
    public static void main(String[] args) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        // mp.put("vaibhav", 2);
        // mp.put("vaibhav", 2);
        // mp.put("vaibhav", 2);
        // mp.put("sashi", 6);
        int arr[]={34,2,3,4,5};
        int c=1;
        // for(int a : arr){
        //     mp.put(a,mp.getOrDefault(a, 0)+1);
        // }
        for(int a : arr){
            mp.put(a, c++);
        }
        System.out.println(mp.get(4));
        //in this scenario we have to use getOrdefault ,agar hame instantly value ko store karana hai toh 
        //if you have not the value in the map so if you count the key then use getOrDefault 
        //getOrDefault check bhi krta hai ki map me ye key phle toh nhi hai agar hai toh usi ko increase krta hai wrna default  0 to 1;
        System.out.println(mp.containsKey(4));
        System.out.println(mp);



        //similarly isme hashset bhi ata hai isme duplicate key ko remove krdiya jata hai 

        HashSet<Integer> st= new HashSet<>();
        st.add(3);
        st.add(6);
        st.add(9);
        st.add(12);
        st.add(12);
        System.out.println(st);


        //similarly treemap hamra sorted order hota hai 



    }
}
////