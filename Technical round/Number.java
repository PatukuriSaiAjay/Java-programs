//checking given number is even or odd
import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int n=scan.nextInt();
        evenOrOdd(n);
    }
    public static void evenOrOdd(int n)
    {
        if(n%2==0)
        {
            System.out.println("Even");
        }
        else
        {
            System.out.println("odd");
        }
    }
    
}

//output
/* 
256
Even

277
odd
*/