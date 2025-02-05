package hashmapp;

public class hash {
    public static void main(String[] args) {
        String s="vaibhav";
        int hash[]=new int[26];
        for(char ch : s.toCharArray()){
            hash[ch-'a']++;
        }

        char ch='a';
        System.out.println(hash[ch-'a']);
    }
}
//