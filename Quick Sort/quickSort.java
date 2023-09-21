import java.util.*;

public class quickSort {
    public static void travSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(arr[arr.length - 1]);
    }

    public static void sorting(int arr[], int start, int end) {
        if (start >= end) {
            return;
        }
        int pivotIndex = partition(arr, start, end);
        sorting(arr, start, pivotIndex - 1);
        sorting(arr, pivotIndex + 1, end);
    }

    public static int partition(int arr[], int start, int end) {
        int pivot = arr[end];
        int i = start - 1;
        for (int j = start; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = arr[end];
        arr[end] = arr[i];
        arr[i] = temp;
        return i;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 6, 3, 9, 8, 2, 5 };
        sorting(arr, 0, arr.length - 1);
        System.out.println("Sorted Array:");
        travSort(arr);
    }
}
