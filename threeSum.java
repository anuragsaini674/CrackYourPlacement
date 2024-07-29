import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class threeSum {

    public static List<List<Integer>> calculate(int nums[], int k){

        int i=0, j=0, r=0;
        List<List<Integer>> ls = new ArrayList<>();
        
        Arrays.sort(nums);
        for(i=0;i<nums.length;i++){
            // System.out.println(i);
            j=i+1;
            r=nums.length-1;
            while(j<r){
                int target = k-(nums[i]+nums[j]);
                // System.out.println(target);
                if(target>nums[r])  j++;
                else if(target<nums[r]) r--;
                else{
                    List<Integer> list = new ArrayList<>();
                    
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(nums[r]);
                    ls.add(new ArrayList<>(list));
                    // for(List<Integer>q: ls){
                    //     System.out.println(q);
                    // }
                    j++;
                    r--;
                    while(nums[j]==nums[j-1] && j<r)    j++;
                    while(nums[r]==nums[r+1] && j<r)    r--;
                }
            }
            while(i<(nums.length-2) && nums[i]==nums[i+1])    i++;
        }



        return ls;

        
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
