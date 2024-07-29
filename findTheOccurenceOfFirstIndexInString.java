import java.util.Scanner;

public class findTheOccurenceOfFirstIndexInString {

    public static int calculate(String haystack, String needle){

        if(needle.length()>haystack.length())   return -1;

        for(int i=0;i<haystack.length();i++){
            if(haystack.charAt(i)==needle.charAt(0)){
                if(i+needle.length()>haystack.length()) return -1;
                String s = haystack.substring(i, i+needle.length());
                if(s.equals(needle)){
                    return i;
                }
            }
        }
        System.out.println(haystack.substring(0,1));
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();


        System.out.println(calculate(s, sc.nextLine()));
    }
    
}
