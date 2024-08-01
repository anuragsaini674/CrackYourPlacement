import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class spiralMatrix {


    public static List<Integer> calculate(int matrix[][]){

        List<Integer> ls = new ArrayList<>();
        int left=0, right=matrix[0].length-1, top=0, bottom=matrix.length-1;

        while(top<=bottom && left<=right){

            for(int i=left;i<=right;i++){
                ls.add(matrix[top][i]);
            }
            top++;

            for(int i=top;i<=bottom;i++){
                ls.add(matrix[i][right]);
            }
            right--;

            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    ls.add(matrix[bottom][i]);
                }
            }
            bottom--;

            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    ls.add(matrix[i][left]);
                }
            }
            left++;
        }

        return ls;
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
