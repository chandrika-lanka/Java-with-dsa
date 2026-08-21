import java.util.*;
class pop{
    public static void main(String[] args){
        Stack <Integer> s = new Stack<>();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);

        System.out.println(" Original Stack: " + s);

        s.pop();
        s.pop();
        System.out.println("Stack After POP Operation: "+ s);
    }
}