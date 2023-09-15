import java.util.*;
public class binary_search{
    public static int search(int arr[], int n){
        //find the mid most element: 
        int start = 0;
        int end = arr.length -1;
        
        while (start <= end){
            int mid = (start+end)/2;
            if(n==arr[mid]){    // found value
                return mid;
            }
            if(arr[mid]<n){    // right condition to check
                start = mid + 1;
            }else{              // left case
                end = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int arr[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        System.out.println("Enter the Number :");
        int key = sc.nextInt();
        int final_value = search(arr, key);
        if (final_value == -1){
            System.out.println("The number not found");
        }
        else{
            System.out.println("The number is at index: "+ final_value);
        }

    }
}