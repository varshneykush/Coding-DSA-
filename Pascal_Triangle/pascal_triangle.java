import java.util.*;

public class pascal_triangle{
    public static void pascal(int n){
        //for the Number of lines: 
        for(int line=1; line<n; line++){
            for(int j=0; j<n-line; j++){
                System.out.print(" ");
            }
        //to present the C: 
        int c= 1;
        for(int i=1; i<=line; i++){
            System.out.print(c + " ");
            c = c*(line-i)/(i);
        }
        System.out.println();
        }

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pascal(n);
    }
}