import java.util.Scanner;

public class moveZeroes {


    public static int[] calculate(int nums[]){

        int l=0, r=0;

        while(r<nums.length){
            if(nums[r]!=0){
                int temp = nums[l];
                nums[l] = nums[r];
                nums[r] = temp;
                l++;
                r++;
            }
            else r++;
        }

        return nums;
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


        arr = calculate(arr);


        System.out.println();
        System.out.println();

        for(int i:arr){
            System.out.print(i+"\t");
        }
    }
    
}
