import java.util.*;
public class removeDuplicates {
    public static void RemoveDuplicate(Stack<Integer> stack){
        Stack<Integer> temp = new Stack<>();
        Set<Integer> seen = new HashSet<>();

        while(!stack.isEmpty()){
            int value = stack.pop();

            if(seen.add(value)){
                temp.push(value);
            }
        }

        while(!temp.isEmpty()){
            stack.push(temp.pop());
        }

    }
    public static void main(String[] args){
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(20);
        stack.push(60);

        RemoveDuplicate(stack);
        System.out.println(stack);
    }
    
}
