import java.util.*;
public class selection_sort{
    public static void selection(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            int current_min=i;
            for(int j=i+1; j<arr.length; j++){
                if (arr[j]<arr[current_min]){
                    current_min = j;
                }
            }
            //Swapping:
            int temp = arr[current_min];
            arr[current_min] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[] = {5, 4, 3, 4, 2, 1};
        selection(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]);
        }
    }
}