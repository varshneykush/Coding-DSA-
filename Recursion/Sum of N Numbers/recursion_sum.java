import java.util.*;

public class recursion_sum {
    public static int printSum(int n) {
        if (n <= 1) {
            return n;
        }
        return n + printSum(n - 1);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
        int result = printSum(n);
        System.out.println("The sum of number is: "+ result);
    }
}
