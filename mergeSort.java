import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class mergeSort{

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


    public static void solve(int nums[], int low, int high){

        if(low==high)   return;

        int mid = (low+high)/2;
        solve(nums, low, mid);
        solve(nums, mid+1, high);

        
        merge(nums, low, mid, high);



        return;
    }


    public static void calculate(int nums[]){

        solve(nums, 0, nums.length-1);
        for(int i: nums){
            System.out.print(i+"\t");
        }

        
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<arr.length;i++){
                arr[i] = sc.nextInt();
        }


        calculate(arr);
    }
    
}
