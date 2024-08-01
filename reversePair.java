import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class reversePair {

    public static int countPairs(int nums[], int low, int mid, int high){
        int right=mid+1;
        int count=0;
        for(int i=low;i<=mid;i++){
            while(right<=high && (long)nums[i]>(long)(2*(long)nums[right]))  right++;
            count += (right-(mid+1));
        }

        return count;
    }

    public static void merge(int nums[], int low, int mid, int high){
        List<Integer> ls = new ArrayList<>();
        int left = low;
        int right = mid+1;
        while(left<=mid && right<=high){
            if(nums[left]<=nums[right]){
                ls.add(nums[left++]);
            }
            else{
                ls.add(nums[right++]);
            }
        }

        while(left<=mid){
            ls.add(nums[left++]);
        }

        while(right<=high){
            ls.add(nums[right++]);
        }

        for(int i=low;i<=high;i++){
            nums[i] = ls.get(i-low);
        }

    }

    public static int divide(int nums[], int low, int high){
        int count=0;
        if(low==high)   return count;
        int mid = (low+high)/2;

        count += divide(nums, low, mid);
        count += divide(nums, mid+1, high);
        count += countPairs(nums, low, mid, high);
        merge(nums, low, mid, high);

        return count;
    }

    public static int calculate(int nums[]){

        
        return divide(nums,0,nums.length-1);
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
