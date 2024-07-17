import java.util.ArrayList;
import java.util.*;

public class chocolateDistributionProblem {

    public static long calculate(List<Integer> a, int n, int m){

        Collections.sort(a);
        long min = Long.MAX_VALUE;
        for(int i=0;i<(n-m+1);i++){
            min = Math.min(a.get(i+m-1)-a.get(i), min);
        }


        return min;
    }



    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        List<Integer> ls = new ArrayList<Integer>();
        int n = 0;
        while(n<size){
            // arr[n] = sc.nextInt();
            ls.add(sc.nextInt());
            n++;
        }

        int m = sc.nextInt();
        System.out.println(calculate(ls, size, m));


        // System.out.println();
        // System.out.println();

        // for(int i:ls){
        //     System.out.print(i+"\t");
        // }
    }
    
}
