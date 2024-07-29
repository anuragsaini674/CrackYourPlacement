import java.util.*;
import java.util.Scanner;

public class smallestWindowContainingAnotherString {

    public static String calculate(String s, String p){

        if(s.length()<p.length())   return "-1";

        int l=0, r=0, idx=-1, count=0, minLength=Integer.MAX_VALUE;
        Map<Character,Integer> hm = new HashMap<>();
        for(int i=0;i<p.length();i++){
            hm.put(p.charAt(i), hm.getOrDefault(p.charAt(i), 0)+1);
        }

        while(r<s.length()){
            
            if(hm.containsKey(s.charAt(r))){
                hm.put(s.charAt(r), hm.get(s.charAt(r))-1);
                if(hm.get(s.charAt(r))>=0)  count++;
                System.out.println("count  "+r+" "+count);
            }

            while(count==p.length()){
                
                if(hm.containsKey(s.charAt(l))){
                    hm.put(s.charAt(l), hm.get(s.charAt(l))+1);
                    if(hm.get(s.charAt(l))>0)   count--;
                }


                if(r-l+1<minLength){
                    minLength=r-l+1;
                    idx=l;
                }
                
                System.out.println("in while at l = "+l+"  "+idx+"   "+minLength);
                l++;
            }
            r++;
        }

        if(idx==-1) return "-1";
        
        else    return s.substring(idx, idx+minLength);   
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();


        System.out.println(calculate(s, sc.nextLine()));
    }
}
