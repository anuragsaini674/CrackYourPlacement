import java.util.Scanner;

public class validPallindromeTwo {

    public static boolean pallindrome(String s, int i, int j){

        while(i<j){
            if(s.charAt(i)!=s.charAt(j))   return false;
            i++;
            j--;
        }
        return true;
    }

    public static boolean calculate(String s){

        int l=0, r=s.length()-1;
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)){
                return pallindrome(s, l+1, r) || pallindrome(s, l, r-1);
            }
            l++;
            r--;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();


        System.out.println(calculate(s));
        sc.close();
    }
    
}
