import java.util.HashMap;
import java.util.*;

public class twoSum {

    public static int[] calculate(int nums[], int target){

        Map<Integer, Integer> hs = new HashMap<Integer, Integer>();
        for(int i=0;i<nums.length;i++){
            int remain = target-nums[i];
            if(hs.containsKey(remain)){
                return new int[] {hs.get(remain), i};
            }
            else{
                hs.put(nums[i], i);
            }
        }
        return new int[] {-1,-1};
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

        System.out.println();
        System.out.println();
        for(int i: calculate(arr, sc.nextInt())){
            System.out.print(i+"\t");
        }
    }
    
}
