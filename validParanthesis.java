import java.util.Scanner;
import java.util.Stack;

public class validParanthesis {

    public static boolean calculate(String s){

        Stack<Character> st = new Stack<Character>();

        for(int i=0;i<s.length();i++){

            if(s.charAt(i)=='(')    st.add(')');
            else if(s.charAt(i)=='{')   st.add('}');
            else if(s.charAt(i)=='[')   st.add(']');
            else if(st.isEmpty() || st.pop()!=s.charAt(i))  return false;
        }

        return st.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();


        System.out.println(calculate(s));
        sc.close();
    }
    
}
