import java.util.Arrays;
import java.util.Scanner;

public class maxProductofThreeNumber {

    public static int calculate(int nums[]){
        Arrays.sort(nums);
        int n=nums.length-1;
        return Math.max(nums[n]*nums[n-1]*nums[n-2], nums[0]*nums[1]*nums[n]);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(calculate(arr));
    }
}
