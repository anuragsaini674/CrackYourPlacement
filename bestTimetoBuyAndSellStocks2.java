import java.util.Arrays;
import java.util.Scanner;

public class bestTimetoBuyAndSellStocks2 {

    public static int find(int prices[], int idx, int buy, int n, int dp[][]){

        if(idx==n)  return 0;

        if(dp[idx][buy]!=-1)    return dp[idx][buy];
        int profit = 0;
        if(buy==1){
            profit = Math.max(-prices[idx]+find(prices, idx+1, 0, n, dp), 0+find(prices, idx+1, 1, n, dp));
        }
        else{
            profit = Math.max(prices[idx]+find(prices, idx+1, 1, n, dp), 0+find(prices, idx+1, 0, n, dp));
        }

        return dp[idx][buy] = profit;
    }

    public static int calculate(int prices[]){

        int dp[][] = new int[prices.length][2];
        for(int[] row: dp){
            Arrays.fill(row, -1);
        }
        return find(prices, 0, 1, prices.length, dp);
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

        System.out.println();
        System.out.println();
        System.out.println(calculate(arr));
    }
}
