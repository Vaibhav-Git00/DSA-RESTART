package linklist;
class Node{
    int val;
    Node next;
    Node prev;

    Node(int val1,Node next1,Node prev1){     //this is the constructor of doubly linkedlist
        this.val=val1;
        this.next=next1;
        this.prev=prev1;
    }
    
    Node(int data1){
        this.val=data1;
        this.next=null;
        this.prev=null;
    }
}


public class practice {

    private static void print(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }

    }
    
    //Array to doubly Linked lList
    private static Node arraytoDLL(int arr[]){
        Node head=new Node(arr[0]);
        Node prev=head;
        for(int i=1;i<arr.length;i++){
            Node temp = new Node(arr[i],null,prev);
            prev.next=temp;
            prev=temp;
        }
        return head;
    }


    public static void main(String[] args) {
        int arr[]={1,2,3};
        Node head=arraytoDLL(arr);
        print(head);
        
    }
}
