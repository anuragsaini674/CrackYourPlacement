import java.util.Collection;
import java.util.*;

public class sortColors {
    

    public static int[] calculate(int nums[]){

        int l = 0;
        int r = nums.length-1;
        int m = 0;


        while(m<=r){
            if(nums[m]==0){
                int temp = nums[l];
                nums[l] = nums[m];
                nums[m] = temp;
                l++;
                m++;
            }
            else if(nums[m]==2){
                int temp = nums[r];
                nums[r] = nums[m];
                nums[m] = temp;
                r--;
            }
            else{
                m++;
            }
        }

        return nums;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        size--;
        while(size>=0){
            arr[size] = sc.nextInt();
            size--;
        }


        arr = calculate(arr);

        System.out.println();
        System.out.println();

        for(int i:arr){
            System.out.print(i+"\t");
        }
    }
}
