import java.util.Scanner;

public class max_min {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any three digit number:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        max(a,b,c);
        min(a,b,c);
    }


    static void max(int a, int b, int c) {
        int max = a;

        if (b > max) 
            max = b;
        if (c > max) 
            max = c;

        System.out.println("MAXIMUM NUMBER :" + max);

    }


    static void min(int a, int b , int c) {
        int min = a;


        if (b < min) 
            min = b;
        if (c < min) 
            min = c;

        System.out.println("MINIMUM NUMBER :" + min);

    }
}