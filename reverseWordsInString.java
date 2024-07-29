import java.util.Scanner;

public class reverseWordsInString {

    public static String calculate(String s){

        int l=s.length(), r=s.length()-1, count=0;
        boolean flag = false;

        while(r>=0){
            if(s.charAt(r)!=' ' && !flag){
                flag = true;
                count++;
            }
            else if(s.charAt(r)!=' ' && flag)    count++;

            else if(s.charAt(r)==' ' && flag){
                flag = false;
                s = s+' '+s.substring(r+1, r+1+count);
                // System.out.println(s);
                count=0;
            }
            if(r==0 && s.charAt(r)!=' '){
                s = s+' '+s.substring(r, r+count);
                // System.out.println(s);
            }    
            r--;
        }
        // System.out.println(l+1);
        // System.out.println(s.length()-1);
        return s = s.substring(l+1, s.length());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();


        System.out.println(calculate(s));
    }
    
}
