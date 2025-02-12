package stackAqueue;

import java.util.LinkedList;
import java.util.Queue;

public class arrayqueue {
    public static void main(String[] args) {
        Queue <Integer> q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q.peek());
        System.out.println(q.poll());
        System.out.println(q.remove());
        System.out.println(q.isEmpty());
        System.out.println(q.offer(30));
        System.out.println(q);

    }
}

//and if u want to use fastet thean the stack and queue then use deque 
//because it apporaches is very fast comparison to the stack and queue 
//and it also insert and delete in the first and last 
