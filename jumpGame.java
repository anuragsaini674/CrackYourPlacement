import java.util.Arrays;
import java.util.Scanner;

public class jumpGame {

    // public static boolean jump(int nums[], int idx, int dp[]){

    //     if(idx>nums.length-1 || dp[idx]==1) return false;
    //     if(idx+nums[idx]>=nums.length){
    //         dp[idx] = 1;
    //         return false;
    //     }
        
    //     if(idx+nums[idx]==nums.length-1)  return true;

    //     return jump(nums, idx+nums[idx], dp);
    // }

    // public static boolean calculate(int nums[]){
        
    //     int dp[] = new int[5];
    //     Arrays.fill(dp, -1);
    //     for(int i=0;i<nums.length;i++){
    //         if(jump(nums, nums[i], dp)) return true;
    //     }

    //     return false;
    // }

    public static boolean calculate(int nums[]){

        if(nums.length==1)  return true;

        int reachable=0;
        for(int i=0;i<nums.length;i++){
            if(i>reachable) return false;

            int temp = nums[i]+i;
            reachable = Math.max(reachable, temp);
            
        }

        if(reachable>=nums.length-1)    return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        int n = 0;
        while(n<size){
            arr[n] = sc.nextInt();
            n++;
        }


        System.out.println(calculate(arr));
    }
    
}
