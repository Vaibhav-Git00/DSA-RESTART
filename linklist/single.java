package linklist;

class Node{
    int data;
    Node next;
    Node(int data1,Node next1){   //this is a constructor
        this.data=data1;
        this.next=next1;
    }
    Node(int data1){
        this.data=data1;
        this.next=null;
    }

};


public class single {
    public static void main(String[] args) {
        int arr[]={3,5,6,3};
        Node y=new Node(arr[0]);
        System.out.println(y.data);
    }
    
}