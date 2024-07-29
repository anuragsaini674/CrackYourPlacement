import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class fourSum {
    
    public static List<List<Integer>> calculate(int nums[], int target){

        int i=0, j=0, l=0, r=0;
        List<List<Integer>> ls = new ArrayList<>();
        Arrays.sort(nums);
        for(i=0;i<nums.length;i++){
            // System.out.println(i);
            for(l=i+1;l<nums.length;l++){
                j=l+1;
                r=nums.length-1;
                while(j<r){
                    
                    // long k = target-(nums[i]+nums[j]+nums[l]);
                    // System.out.println(nums[i]+nums[j]+nums[l]);
                    // System.out.println(k);
                    long sum = (long)nums[i]+(long)nums[l]+(long)nums[j]+(long)nums[r];
                    // System.out.println((long)nums[i]+(long)nums[l]+(long)nums[j]+(long)nums[r]);
                    if(sum<target)  j++;
                    else if(sum>target) r--;
                    else{
                        List<Integer> list = new ArrayList<>();
                        System.out.println(i);
                        list.add(nums[i]);
                        list.add(nums[l]);
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
                while(l<(nums.length-2) && nums[l]==nums[l+1])    l++;
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

        List<List<Integer>> ls = new ArrayList<>();
        ls = calculate(arr, sc.nextInt());

        for(List<Integer> i: ls){
            System.out.println(i);
        }
    }
}
