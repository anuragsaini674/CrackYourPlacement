import java.util.Scanner;

public class maxPointYouCanObtainFromCards {

    public static int calculate(int cardPoints[], int k){

        int maxSum=0, l=k-1, r=cardPoints.length, sum=0;
        for(int i=0;i<k;i++){
            sum += cardPoints[i];
        }

        maxSum = sum;

        while(l>=0){
            sum -= cardPoints[l--];
            sum += cardPoints[--r];
            maxSum = Math.max(maxSum, sum);
        }

        return maxSum;
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
