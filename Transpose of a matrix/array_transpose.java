import java.util.*;
public class array_transpose{
    public static void transpose(int arr[][]){
        int row = arr.length;
        int coloumn = arr[0].length;
        for(int i=0; i<=row-1; i++){
            for(int j=i+1; j<=coloumn-1; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int arr[][] = {{1, 2, 3},
                    {5, 6, 7},
                    {9, 10, 11}};
        System.out.println("The original Matrix is: ");
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        transpose(arr);
        System.out.println("The Matrix after Transpose is: ");

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}