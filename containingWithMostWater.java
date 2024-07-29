import java.util.Scanner;

public class containingWithMostWater {

    public static int calculate(int height[]){

        int maxVolume=0, l=0, r=height.length-1, lmax = Integer.MIN_VALUE, rmax = Integer.MIN_VALUE;

        while(l<r){
            maxVolume = Math.max(maxVolume, (r-l)*Math.min(height[l], height[r]));

            lmax = Math.max(lmax, height[l]);
            rmax = Math.max(height[r], rmax);

            if(lmax>rmax)   r--;
            else    l++;
        }

        

        return maxVolume;
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
