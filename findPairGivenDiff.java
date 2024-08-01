import java.util.Arrays;
import java.util.Scanner;

public class findPairGivenDiff {

    public static int search(int num, int arr[]){
        int low=0, high=arr.length-1;

        while(low<=high){
            int mid = (low+high)/2;

            if(num==arr[mid]) return 1;

            else if(num>arr[mid])   low=mid+1;

            else    high=mid-1;
        }

        return -1;
    }
    
    public static int calculate(int n, int x, int arr[]){
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            return search(Math.abs(arr[i]-x),arr);
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        int size = sc.nextInt();
        int arr[] = new int[size];

        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(calculate(size, sc.nextInt(), arr));
        
    }
}
