import java.util.Scanner;

public class majorityElement{

    public static int calculate(int nums[]){
        int can=nums[0], count=0;

        for(int i:nums){
            if(i==can)    count++;
            else    count--;

            if(count==0){
                can = i;
                count++;
            }
        }

        return can;
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