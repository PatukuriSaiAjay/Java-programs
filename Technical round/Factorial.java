//print the factorial value of a given number

import java.util.Scanner;

public class Factorial {
    public static int FactorialOfNumber(int n)
    {
        int res=1;
        //writing factorial loop
        for(int i=1;i<=n;i++)
        {
            res=res*i;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        
        //user input
        int n=scan.nextInt();

        //calling a method
        int result= FactorialOfNumber(n);
        System.out.println(result);
    }
}

//output
//5
//120