import java.util.Scanner;

public class bestTimetoBuyAndSellStocks2 {

    public static int find(int prices[], int idx, int buy, int n){

        if(idx==n)  return 0;

        int profit = 0;
        if(buy==1){
            profit = Math.max(-prices[idx]+find(prices, idx+1, 0, n), 0+find(prices, idx+1, 1, n));
        }
        else{
            profit = Math.max(prices[idx]+find(prices, idx+1, 1, n), 0+find(prices, idx+1, 0, n));
        }

        return profit;
    }

    public static int calculate(int prices[]){


        return find(prices, 0, 1, prices.length);
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
