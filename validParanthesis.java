import java.util.Scanner;
import java.util.Stack;

public class validParanthesis {

    public static boolean calculate(String s){

        Stack<Integer> st = new Stack<Integer>();

        for(int i=0;i<s.length();i++){

            if(s.charAt(i)=='(')    st.push(1);
            else if(s.charAt(i)==')'){
                if(st.pop()==1) return false;
            }


            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='[')    st.push(1);
            else    if(st.pop()!=1) return false;     
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
