import java.util.*;
public class bubbleSort{
    public static void bubble(int arr[]){
        for(int i=0; i<=arr.length-1; i++){
            for(int j=i+1; j<=arr.length-1; j++){
                if (arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        bubble(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}

