import java.util.*;
public class factorialRecursion{
    public static int factorial(int n){
        if(n <= 1){
            return 1;
        }
        int fact = n * factorial(n-1);
        return fact;

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = sc.nextInt();
        int result = factorial(n);
        System.out.println("Factorial is: " + result);

    }
}