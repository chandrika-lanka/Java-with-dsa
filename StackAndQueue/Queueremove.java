import java.util.*;
class Queueremove{
    public static void main(String[] args){
        Queue<Integer> q = new LinkedList<>();

        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);

        System.out.println("Original Queue: "+q);

        q.remove();
        q.poll();
        System.out.println("After Remove Operation: "+q);
    }
}