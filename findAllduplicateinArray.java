import java.util.*;

public class findAllduplicateinArray {


    public static List<Integer> calculate(int nums[]){

        List<Integer> ls = new ArrayList<>();
        Set<Integer> hs = new HashSet<>();
        // Arrays.sort(nums);
        // for(int i=0;i<nums.length-1;i++){
        //     if(nums[i]==nums[i+1]){
        //         ls.add(nums[i]);
        //     }
        // }

        for(int i=0;i<nums.length;i++){
            if(!hs.add(nums[i]))    ls.add(nums[i]);
        }

        return ls;
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

        List<Integer> ls = new ArrayList<>();
        ls = calculate(arr);


        System.out.println();
        System.out.println();
        for(int i:ls){
            System.out.println(i+"\t");
        }
    }
    
}
