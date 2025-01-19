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

public class lengthofLL {

    private static Node arraytoLL(int arr[]){
        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i=1;i<arr.length;i++){
            Node temp =new Node(arr[i]);
            mover.next=temp;
            mover=temp;
        }
        return head;
    }
    private static int lenofLL(Node head){
        int cnt=0;
        Node temp = head;
        while(temp !=  null){
            cnt++;
            temp=temp.next;
        }
        return cnt;

    }
    public static void main(String[] args) {
        int arr[]={3,5,6,3};
        Node head= arraytoLL(arr);
        System.out.println(lenofLL(head));

    }
}
