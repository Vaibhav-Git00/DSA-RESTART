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

public class inserthead {

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


    //insert heaadd
    private static Node inserheadd(int val,Node head){
        Node temp= new Node(val,head);
        return temp;
    }

    //insert tail
    private static Node inserttaill(int val ,Node head){
        if(head == null){
            return new Node(val);
        } 
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        Node newnode = new Node(val);
        temp.next=newnode;
        return head;
    }


    //insert kth position
    private static Node insertkth(Node head,int k,int el){
        if(head == null){
            if(k==1){
                return new Node(el);
            }else{
                return head;
            }
        }
        if(k==1){
            Node temp = new Node(el,head);
            return temp;
        }
        int cnt=0;
        Node temp = head;
        while(temp != null){
            cnt++;
            if(cnt == (k-1)){
                Node newnode = new Node(el);
                newnode.next=temp.next;
                temp.next=newnode;
                break;
            }
            temp =temp.next;
        }
        return head;
    }



    //insert element before the value of n
    private static Node insertelbefore(Node head,int el,int val){
        if(head == null){
            return null;
        }
        if(head.data==val){
            Node temp = new Node(el,head);
            return temp;
        }

        Node temp = head;
        while(temp.next != null){   //before value ko insert karana hai isliye condition ek phle check ho rhi hai 
            
            if(temp.next.data == val){
                Node newnode = new Node(el);
                newnode.next=temp.next;
                temp.next=newnode;
                break;
            }
            temp =temp.next;
        }
        return head;
    }
    public static void main(String[] args) {
        int arr[]={3,5,3,5,6};
        Node head= arraytoLL(arr);
        head = insertelbefore(head,3,6);
        print(head);
 
    }

}
