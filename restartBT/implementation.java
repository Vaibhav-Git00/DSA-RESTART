package restartBT;

import binarytrees.preorder;

public class implementation {
    public static class Node {
    
        int val; //initially 0 set rhta hai 
        Node left;   //initially null set rhta hai 
        Node right;  //initially null set rhta hai 

        public Node(int val){
            this.val=val;
            this.left=null;
            this.right=null;
        }
    }
    public static void display(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.val+" -> ");
        if(root.left!=null) System.out.print(root.left.val + " ");
        if(root.right!=null) System.out.print(root.right.val + " ");
        System.out.println();
        display(root.left);
        display(root.right);
    }
    //preorder traversal or display
    public static void preorder(Node root){
        if(root==null) return ;
        System.out.print(root.val+" ");
        preorder(root.left);
        preorder(root.right);

    }




    //size of the bt
    public static int size(Node root){
        if(root==null) return 0;
        int left =size(root.left);
        int right=size(root.right);
        return 1+left+right;
        //self root khud and uske left aur right bhi
    }




    //find the sum of the tree node
    public static int sum(Node root){
        if(root==null) return 0;
        int left=sum(root.left);
        int right =sum(root.right);
        return root.val+left+right;
    }




    //find the max value of the tree
    public static int max(Node root){
        if(root==null) return Integer.MIN_VALUE;  //because we are finding the max between the negative value nodes then it give 0 and giving the correct answer that why using minvalue;
        int a=root.val;
        int b=max(root.left);
        int c=max(root.right);
        return Math.max(a,Math.max(b,c));
    }


    //find the height of the tree
    public static int height(Node root){
        if(root.left==null && root.right==null) return 0;
        //bhai null tak jana hi nhi hai anh agar jana hai toh ye second wali condition use karna 
        // if(root==null)return -1; //height of the tree is -1 if the tree is empty 

        int left=height(root.left);
        int right=height(root.right);
        return 1+ Math.max(left,right);
        //ek node khud and left or right me se jo bhi bada hoga uska height kyuki utni hi height lambi hogi
    }
    public static int min(Node root){
        if(root==null) return Integer.MAX_VALUE;
        int a=root.val;
        int b=min(root.left);
        int c=min(root.right);
        return Math.min(a,Math.min(b,c));
    }
    public static int product(Node root){
        if(root==null) return 1;
        int left=product(root.left);
        int right=product(root.right);
        return root.val * left* right;
    }

    public static void main(String[] args) {
        Node root =new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);
        root.left=a;
        root.right=b;
        Node c= new Node(4);
        Node d=new Node(5);
        a.left=c;
        a.right=d;
        Node e=new Node(6);
        Node f=new Node(7);
        b.left=e;
        b.right=f;
        // System.out.println(root);
        // display(root);
        // preorder(root);
        System.out.println(size(root));
        System.out.println(sum(root));
        System.out.println(max(root));
        System.out.println(height(root));
        System.out.println(min(root));
        System.out.println(product(root));
 
    }
} 
