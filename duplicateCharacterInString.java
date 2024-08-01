import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class duplicateCharacterInString{

    public static int calculate(String s){

        int count=0;
        Set<Character> hs = new HashSet<>();

        for(Character c: s.toCharArray()){
            if(!hs.add(c)) count++;
        }
        

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(calculate(sc.nextLine()));
    }
}