import java.util.Arrays;
import java.util.Scanner;

public class gameOfLife {

    public static int solve(int board[][], int dp[][], int answer[][], int i, int j){

        if(dp[i][j]!=-1)    return dp[i][j];
        if(i<0 || j<0 || i>=board.length || j>=board[0].length || board[i][j]==5)   return 0;

        int temp = board[i][j];
        board[i][j] = 5;

        dp[i][j] = solve(board, dp, answer, i+1, j)+solve(board, dp, answer, i-1, j)+
        solve(board, dp, answer, i, j+1)+solve(board, dp, answer, i, j-1)+
        solve(board, dp, answer, i+1, j+1)+solve(board, dp, answer, i-1, j+1)+
        solve(board, dp, answer, i-1, j-1)+solve(board, dp, answer, i+1, j-1);

        board[i][j] = temp;
        
        if(board[i][j]==1){
            if(dp[i][j]<2)  answer[i][j] = 0;
            else if(dp[i][j]>3) answer[i][j] = 0;
            else    answer[i][j] = board[i][j];
        }
        else{
            if(dp[i][j]==3) answer[i][j]=1;
            else    answer[i][j] = board[i][j];
        }
        return 0;
    }

    public static void calculate(int board[][]){
        int dp[][] = new int[board.length][board[0].length];
        for(int i[]:board){
            Arrays.fill(i, -1);
        }
        int answer[][] = new int[board.length][board[0].length];

        solve(board, dp, answer, 0, 0);

        board = answer;

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[sc.nextInt()][sc.nextInt()];
        for(int i=0;i<arr.length;i++){
            for(int j=0;i<arr[0].length;j++){
                arr[i][j] = sc.nextInt();
            }
        }


        System.out.println(calculate(arr));
    }
    
}
