//exception handelling by using try and catch block

import java.util.Scanner;

class Demo
{
    void alpha()
    {
        Scanner scan= new Scanner(System.in);
        System.out.println("Connection established2");

       try
        {
            System.out.println("Enter the first number");
            int num1=scan.nextInt();
    
            System.out.println("Enter the second number");
            int num2=scan.nextInt();
    
            int num3=num1/num2;
            System.out.println(num3);
        } 
       catch (Exception e) 
       {
            System.out.println("Handeled in alpha");
       }
       System.out.println("Connection terminated2");
    }
}


public class Example1 {
    
    public static void main(String[] args) {
        
        System.out.println("Connection established1");

        Demo d= new Demo();
        d.alpha();

        System.out.println("Connection terminated1");
    }
}


//output

/*

Connection established1
Connection established2
Enter the first number
100
Enter the second number
0
Handeled in alpha
Connection terminated2
Connection terminated1

 */