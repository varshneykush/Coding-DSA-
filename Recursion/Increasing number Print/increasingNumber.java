import java.util.*;
public class increasingNumber{
    public static void increase(int n){
        if (n == 1){
            System.out.println(1);
            return;
        }
        increase(n-1);
        System.out.println(n);
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int p = sc.nextInt();
        increase(p);

    }
}