package linklist;

class Node{
    int data;
    Node next;
    Node back;
    
    Node(int data1,Node next1,Node back1){     //this is the constructor of doubly linkedlist
        this.data=data1;
        this.next=next1;
        this.back=back1;
    }

    Node(int data1){
        this.data=data1;
        this.next=null;
        this.back=null;
    }
}

public class insertDll {
    
    //printing the linklist
    private static void print(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }

    }
    
    //Array to doubly Linked lList
    private static Node arraytoDLL(int arr[]){
        Node head=new Node(arr[0]);
        Node prev=head;
        for(int i=1;i<arr.length;i++){
            Node temp = new Node(arr[i],(Node) null,prev);
            prev.next=temp;
            prev=temp;
        }
        return head;
    }

    //insert a node before a head

    private static Node inserthead(Node head,int val){
        Node new1=new Node(val,head,null);
        head.back=new1;
        return new1;
    }


    //insert the node before a tail 
    private static Node inserttail(Node head,int val){
        if(head.next==null){
            return inserthead(head, val);
        }
        Node tail=head;
        while(tail.next!=null){
            tail=tail.next;
        }
        Node prev=tail.back;
        Node newnode=new Node(val,tail,prev);

        prev.next=newnode;
        tail.back=newnode;
        return head;

    }


    //insert the node before the kth
    private static Node insertkth(Node head,int val,int k){
        if(k==1){
            return inserthead(head, val);
        }
        Node temp=head;
        int cnt=0;
        while(temp!=null){
            cnt++;
            if(cnt==k) break;
            temp=temp.next;
        }
        Node prev=temp.back;
        Node newnode=new Node(val, temp, prev);
        prev.next=newnode;
        temp.back=newnode;
        return head;

    }


    //insert node before the node;
    private static void insetbeforenode(Node node,int val){
        Node prev=node.back;
        Node newnode=new Node(val,node,prev);
        prev.next=newnode;
        node.back=newnode;
        return ;
    }



    //insert node after the head
    private static Node insertafterhead(Node head,int el ){

        Node newnode = new Node(el);
        if(head!=null){
            newnode.next=head.next;
            head.next=newnode;

        }else{
            head=newnode;
        }
        return head ;
        
    }
    public static void main(String[] args) {
        int arr[]={1,2,3};
        Node head=arraytoDLL(arr);
        insertafterhead(head, 3);
        print(head);
        
    }
}
//clpspsss
