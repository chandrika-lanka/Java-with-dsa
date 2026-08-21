package assignments.pattern-programs;

public import java.util.Scanner;
public class flyodtraingle{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int nums = 1;
        for (int i = 1; i<= n; i++){
            for (int j = 1; j<= i; j++){
                System.out.print(nums+" ");
                nums++;
            }
            System.out.println();
        }
    }
} {
    
}
