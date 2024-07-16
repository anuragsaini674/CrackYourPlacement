import java.util.*;


// FInd the dupliacte number using Floyd's Algotrithm(Slow and Fast Pointer)

public class findTheDuplicateNumber{

    public static int calculate(int arr[]){

        int slow=0, fast=0;

        do{
            slow = arr[slow];
            fast = arr[arr[fast]];
        }while(slow!=fast);

        slow=0;
        while(slow!=fast){
            slow = arr[slow];
            fast = arr[fast];
        }

        return slow;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        size--;
        while(size>=0){
            arr[size] = sc.nextInt();
            size--;
        }

        System.out.println("Answer: "+calculate(arr));
    }
}