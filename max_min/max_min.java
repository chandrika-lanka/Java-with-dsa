import java.util.Scanner;
class max_min{

    public static int largest (int[] arr){
        int maxi = arr[0];
        for (int i =0 ; i<arr.length-1; i++){
            if (arr[i]> maxi){
                maxi = arr[i];
            }
        }
        return maxi;
    }

    public static int smallest(int[] arr){
        int mini = arr[0];
        for (int i = 0; i< arr.length-1; i++){
            if (arr[i]<mini ){
                mini = arr[i];
            } 
        }
        return mini;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[3];
        for (int i = 0; i<= 2; i++){
            numbers[i] = sc.nextInt();
        }
        int maximum = largest(numbers);
        int minimum = smallest(numbers);
        System.out.println("is the maximum number" + maximum);
        System.out.println("is the min number" + minimum);
    }
    
    
    
    
}