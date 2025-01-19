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


public class deletionhead {


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


    private static void print(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp= temp.next;
        }
    }


    //this is deletion of head
    private static Node deletehead(Node head){
        if(head == null ) return head; //this case will apply for if the linklist is empty 
        Node temp = head;
        head=head.next;
        return head;
    }


    //this is deletion of tail 
    private static Node deletetail(Node head){
        if (head== null || head.next==null) return null;  //this is the 2 case ,1 -> if head is empty ,2-> node is less than 2 thn give the null;kyuki 1 node me ham tail ko remove nhi kar sakteee 
        Node temp = head;
        while(temp.next.next != null){    
            temp = temp.next;    //moving the temp
        }
        temp.next=null;    
        return head;
    }

    //this is deletion of delete of k ;
    private static Node deleteK(Node head,int k){
        if ( head == null ) return head;
        if( k==1){
            Node temp = head;
            head=temp.next;
            return head;
        }
        int cnt=0;
        Node temp = head;
        Node prev=null;
        while (temp != null){   //is this element or not 
            cnt++;             
            if(cnt == k){       //1 index wala toh upar hi remove hogya tha agar 1 waha nhi hoga tab 1 is done with the prev;
                prev.next=prev.next.next;
                break;
            }
            prev=temp;
            temp=temp.next;
        }
        return head;
    }


    private static Node deleteEl(Node head,int el){
        if(head == null) return head;
        
        if(head.data == el){
            Node temp = head;
            head= temp.next;
            return head;
        }
        Node temp = head;
        Node prev= null;
        while ( temp != null){
            if(temp.data==el){
                prev.next=prev.next.next;
                break;
            }
            prev=temp;
            temp=temp.next;   //this is traversal moving the node 
        }
        return head;
    }
    public static void main(String[] args) {
        int arr[]={3,5,3,5,6};
        Node head= arraytoLL(arr);
        head= deleteEl(head,3);
        print(head);
 
    }
}
