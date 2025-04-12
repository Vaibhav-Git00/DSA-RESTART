package restartBT;
import java.util.*;;
public class orders {
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


    //preorder traversal or display
    public static void preorder(Node root){
        if(root==null) return ;
        System.out.print(root.val+" ");
        preorder(root.left);
        preorder(root.right);
    }

    //inorder traversal or display
    public static void inorder(Node root){
        if(root==null) return;
        inorder(root.left);
        System.out.print(root.val+" ");
        inorder(root.right);
    }
    

    //postorder traversal or display 
    public static void postorder(Node root){
        if(root==null) return ;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val+" ");
    }

    //level order traversal BFS
    public static void levelOrder(Node root,int n){
        if(root==null) return;  
        //apna n bhej do sath me root ke sath jab n tumhara 1 ke equal ho jaye iska matlb 1 tumhare sahi level pe pahuch gya hai tab root print krwaa do 
        if(n==1){
            System.out.print(root.val+" ");
            return ;  //yaha return na bhi lagao toh bhi chal jayega but tab uski tc 0nlongn ho jayegi and redurn krne ke baat woh tc 0(n) ho jayegiii

        } //ek level pe jane ke baad band krdo kahe bar bar chalyenge ham use 
        levelOrder(root.left, n-1);
        levelOrder(root.right, n-1);

    }


    //level order traversal BFS WITHOUT RECURSION USING QUEUE;
    public static void bfs(Node root){
        Queue<Node> q = new LinkedList<>();
        if(root!=null) q.add(root);
        while(q.size()>0){
            Node temp=q.peek();
            if(root.left!=null) q.add(root.left);
            if(root.right!=null) q.add(root.right);
            System.out.print(temp.val+" ");
            q.remove();
        }
    }



    public static int height(Node root){
        if(root==null) return -1;
        int left=height(root.left);
        int right=height(root.right);
        return 1+Math.max(left,right);
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
        // preorder(root);
        // System.out.println();
        // inorder(root);
        // System.out.println();
        // postorder(root);
        // System.out.println();

        //ye o(nlogn) hai bahut ganda tarika hai kyuki  ek ek level jayega log of n and har level pe jaker node print krega o(n) chalega 
        int level=height(root)+1;
        for(int i=1;i<=level;i++){
            levelOrder(root, i);
            System.out.println();
        }
        // levelOrder(root, 3);  //ye toh hogyi kisi ek level kii

    }
}
