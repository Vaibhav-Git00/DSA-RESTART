package binarytrees;

import java.util.*;

class Node {
    int data;
    Node left;
    Node right;
    
    Node(int val) {
        data = val;
        left = null;
        right = null;
    }

    // Postorder traversal helper function
    static void postorder(Node root, List<Integer> arr) {
        if (root == null) {
            return;
        }
        postorder(root.left, arr);
        postorder(root.right, arr);
        arr.add(root.data);  // Root added at the end
    }

    // Returns the postorder traversal as a list 
    static List<Integer> postorder(Node root) {
        List<Integer> arr = new ArrayList<>();
        postorder(root, arr);
        return arr;
    }
}

public class PostorderTraversal {  // Renamed class to follow naming convention
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        // Call postorder using the Node class
        List<Integer> result = Node.postorder(root);

        // Print the postorder traversal
        for (int val : result) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}



//




////....