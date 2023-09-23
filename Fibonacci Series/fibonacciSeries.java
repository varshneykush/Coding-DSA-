import java.util.*;
public class fibonacciSeries{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number till fibonacci series print: ");
        int n = sc.nextInt();
        int firstNumber =0;
        int secondNumber = 1;

        if (n ==0){
            System.out.print(firstNumber + " ");
        }
        if ( n == 1){
            System.out.print(secondNumber + " ");

        }
        
        for(int i=3; i<=n; i++){
                int nextTerm = firstNumber + secondNumber;
                System.out.print(nextTerm + " ");

                firstNumber = secondNumber;
                secondNumber = nextTerm;

            }
        }
    }
