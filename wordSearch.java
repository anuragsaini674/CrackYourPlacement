import java.util.Scanner;

public class wordSearch {


    public static boolean search(char board[][], String word, int idx, int i, int j){

        if(idx==word.length())    return true;

        if(i<0 || j<0 || i>=board.length || j>=board[0].length || board[i][j]=='1' || board[i][j]!=word.charAt(idx))  return false;

        char temp = board[i][j];
        board[i][j] = '1';
        boolean res = search(board, word, idx+1, i+1, j) || search(board, word, idx+1, i-1, j) || search(board, word, idx+1, i, j+1) || search(board, word, idx+1, i, j-1);
        board[i][j] = temp;

        return res;

    }

    public static boolean calculate(char board[][], String word){
        boolean res = false;
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==word.charAt(0)){
                    res = search(board, word, 0, i, j);
                    if(res) return res;
                }
            }
        }

        return res;
    }

    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        char arr[][] = new char[n][m];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j] = sc.next().charAt(0);
            }
        }


        System.out.println(calculate(arr, sc.nextLine()));
    }
}
