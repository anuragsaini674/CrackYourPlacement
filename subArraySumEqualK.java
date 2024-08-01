import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class subArraySumEqualK {

    // public static int find(int nums[], int k){

        // For +ve integer
    //     if(k<0) return 0;
    //     int count=0, sum=0, l=0, r=0;
    //     while(r<nums.length){
    //         // System.out.println("in while");
    //         sum+=nums[r];
    //         while(sum>k){
    //             // System.out.println("in while2");
    //             sum -= nums[l];
    //             l++;
    //         }
    //         count+= r-l+1;
    //         r++;

    //     }


    //     return count;
    // }


    // public static int calculate(int nums[], int k){

    //     return find(nums, k)-find(nums,k-1);
    // }


    public static int calculate(int nums[], int k){

        int count=0, sum=0, r=0;
        Map<Integer, Integer> hm = new HashMap<>();
        hm.put(0, 1);
        while(r<nums.length){
            sum+=nums[r];
            if(hm.containsKey(sum-k)){
                count+=hm.get(sum-k);
            }
            hm.put(sum, hm.getOrDefault(sum, 0)+1);
            r++;
        }


        return count;
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


        System.out.println(calculate(arr, sc.nextInt()));
    }
    
}
