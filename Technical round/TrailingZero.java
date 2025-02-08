

// Trailing of zero

import java.util.Scanner;



public class TrailingZero {
    
    public static int TrailingOfZero(int n)
    {
        int res=0;
        int powerOf5=5;
        while(n>= powerOf5)
        {
            res=res+(n/powerOf5);
            powerOf5=powerOf5*5;
        }
        return res;

    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        
        //user input
        int n=scan.nextInt();

        //calling a method
        int result= TrailingOfZero(n);
        System.out.println(result);
    }
}

//output
//10
//2


