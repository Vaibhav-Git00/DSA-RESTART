package binarytrees;

import java.util.*;

class Node{
    int data;
    Node left;
    Node right ;

    Node(int val){
        data=val;
        left=null;
        right=null;
    }
}

public class preorder {

    static void preorder(Node root,List<Integer> arr){
        if(root==null){
            return;
        }
        arr.add(root.data);
        preorder(root.left, arr);
        preorder(root.right, arr);
    }

    //function to initialize the preorder traversal 
    //and return the resulting list 
    //array ke liye function isliye banaye ki is function me ham isse pass krke chize arr print krwa denge and main function se ek alag arraylist me store kara lenge 
    static List<Integer> preorder(Node root){
        List<Integer> arr = new ArrayList<>();
        preorder(root,arr);
        return arr;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        List<Integer> result = preorder(root);
        // Output each value in the
        // preorder traversal result
        for (int val : result) {
            System.out.print(val + " ");
        }
        System.out.println();

    }
}
