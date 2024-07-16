import java.util.Scanner;

public class removeDuplicateFromSortedArray {
    
    public static int calculate(int nums[]){

        int l=0, r=1, i=1;

        while(r<nums.length){
            if(nums[l]!=nums[r]){
                nums[i] = nums[r];
                i++;
                l=r;
                r++;
            }
            else    r++;
        }
        return i;
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

        // System.out.println();
        // System.out.println();
        // for(int i:arr){
        //     System.out.print(i+"\t");
        // }
    }
}
