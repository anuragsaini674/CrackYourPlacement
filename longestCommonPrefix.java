import java.util.Arrays;
import java.util.Scanner;

public class longestCommonPrefix {
    
    public static String calculate(String strs[]){

        String s="";
        Arrays.sort(strs);

        for(int i=0;i<Math.min(strs[0].length(), strs[strs.length-1].length());i++){
            if(strs[0].charAt(i)==strs[strs.length-1].charAt(i))    s+=strs[0].charAt(i);
            else    break;
        }


        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        String arr[] = new String[size];
        for(int i=0;i<arr.length;i++){
            System.out.println(i);
            arr[i] = sc.nextLine();
        }

        System.out.println(calculate(arr));
    }
}
