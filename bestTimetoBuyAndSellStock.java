import java.util.Scanner;

public class bestTimetoBuyAndSellStock {


    public static int calculate(int prices[]){
        int min=prices[0] ,profit=0;

        for(int i=1;i<prices.length;i++){
            int cost = prices[i]-min;
            profit = Math.max(profit, cost);

            min = Math.min(min, prices[i]);
        }

        return profit;
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


        // System.out.println();
        // System.out.println();

        // for(int i:arr){
        //     System.out.print(i+"\t");
        // }
    }
    
}
