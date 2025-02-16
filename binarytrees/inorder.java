package binarytrees;

import java.util.*;

class Node{
    int data;
    Node left;
    Node right;
    
    Node(int val){
        data=val;
        left=null;
        right=null;
    }
    static void inorderr(Node root,List<Integer> arr){
        if(root ==null){
            return ;
        }
        inorderr(root.left,arr);
        arr.add(root.data);
        inorderr(root.right,arr);
    }
    static List<Integer> inorderr(Node root){
        List<Integer> arr= new ArrayList<>();
        inorderr(root,arr);
        return arr;
    }
}
public class inorder {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        List<Integer> result= Node.inorderr(root);
        for(int val : result){
            System.out.println(val+ " ");
        }
        System.out.println();
    }
}
