import java.util.*;

public class exp2 {
    public static void main(String[] args) {

        ArrayList<String> list=new ArrayList<>();

        list.add("Java");
        list.add("Python");

        System.out.println(list.get(0));

        list.set(1,"C++");

        list.remove(0);

        System.out.println(list.contains("C++"));

        System.out.println(list.size());

        list.clear();

        System.out.println(list.isEmpty());
    }
}