import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class subArraySumDivisibleByK {

    public static int calculate(int nums[], int k){

        int count=0;
        Map<Integer,Integer> hm = new HashMap<>();
        int sum=0;
        hm.put(0, 1);

        for(int i=0;i<nums.length;i++){
            sum += nums[i];
            int rem = sum%k;
            if(rem<0)   rem+=k;
            if(hm.containsKey(rem)){
                count += hm.get(rem);
            }
            hm.put(rem, hm.getOrDefault(rem, 0)+1);
            
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
