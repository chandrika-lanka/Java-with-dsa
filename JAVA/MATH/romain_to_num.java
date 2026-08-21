import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class romain_to_num {

    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();

        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            int current = map.get(s.charAt(i));

            if (i < s.length() - 1 &&
                current < map.get(s.charAt(i + 1))) {
                result -= current;
            } else {
                result += current;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.print("enter roman number:");
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        romain_to_num obj = new romain_to_num();

        int x = obj.romanToInt(num);

        System.out.println(x);
    }
}