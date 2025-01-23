
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


public class deletionDLL {

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

    //delete the head
    private static Node deletehead(Node head){
        if(head==null || head.next==null){
            return null;
        }
        Node prev=head;
        head=head.next;
        head.back=null;
        prev.next=null;
        return head;
    } 

    //delete the tail 
    private static Node deletetail(Node head){
        if(head ==null||head.next==null){
            return null;
        }
        Node tail=head;
        while(tail.next!=null){
            tail=tail.next;

        }
        Node prev=tail.back;
        tail.back=null;
        prev.next=null;
        return head;
    }

    //delete the kth element
    private static Node deletekth(Node head,int k){
        if(head==null ){
            return null;
        }
        int cnt=0;
        Node knode = head;
        while (knode!=null){
            cnt++;
            if(cnt==k) break;
            knode=knode.next;
        }
        Node prev=knode.back;
        Node front=knode.next;
        //jab bhi naya node banta hai aur usko age wale refrence see connect krna hai to ye upar line jaisa hota hai 
        if(prev==null && front == null){
            return null;
        }else if(prev ==null){
            return deletehead(head);
        }else if(front == null){
            return deletetail(head);
        }
          //aur jab hame kuch refrence se changes krne hote hai next ko chedte nhi haii bas usme agla node dal dete hai 
        prev.next=front;
        front.back=prev;
        knode.next=null;
        knode.back=null;
        return head;
    }

    //delete the element
    // private static Node deleteel(Node head,int el){
    //     if(head==null ){
    //         return null;
    //     }
        
    //     Node knode = head;
    //     while (knode!=null){
    //         if(knode.data==el) break;
    //         knode=knode.next;
    //     }
    //     Node prev=knode.back;
    //     Node front=knode.next;
        
    //     if(prev==null && front == null){
    //         return null;
    //     }else if(prev ==null){
    //         return deletehead(head);
    //     }else if(front == null){
    //         return deletetail(head);
    //     }
      
    //     prev.next=front;
    //     front.back=prev;
    //     knode.next=null;
    //     knode.back=null;
    //     return head;
    // }


    //delete the node given
    private static void deletenode(Node temp){
        Node prev=temp.back;
        Node front =temp.next;
        if(front ==null){
            prev.next=null;
            temp.back=null;
            return;
        }
        prev.next=front;
        front.back=prev;
        temp.next=temp.back=null;

    }

    public static void main(String[] args) {
        int arr[]={1,2,3};
        Node head=arraytoDLL(arr);
        deletenode(head.next);
        print(head);
        
    }
}
