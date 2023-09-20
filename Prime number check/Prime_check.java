import java.util.*;
public class Prime_check{
    public static boolean isPrime(int n){
        boolean prime = true;
        if (n<=1){
            return false;
        }
        for(int i=2; i<=Math.sqrt(n); i++){
            if (n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check prime: ");
        int n = sc.nextInt();
        boolean result = isPrime(n);
        if (result == true){
            System.out.println("Prime Number");
        }
        else{
            System.out.println("Not a Prime Number");
        }
    }
}