package binarytrees;
class Node{
    int data ;
    int left;
    int right ;
    public Node(int key){
        data=key;
    }
}
public class implementation {
    Node root;
    public implementation(){
        Node root = new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.right.left=new Node(4);
    }

}
