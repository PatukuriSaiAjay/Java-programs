//exception handling by using re throwing concept 
import java.util.Scanner;

class Demo
{
    void alpha() throws Exception
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
            throw e;
       }
      
       finally
       {
        System.out.println("Connection terminated2");
       }
    }
}


public class Example2 {
    
    public static void main(String[] args) {
        
        System.out.println("Connection established1");

       try
        {
        Demo d= new Demo();
        d.alpha();
       }
        catch (Exception e)
        {
            System.out.println("Handled in main");
        }

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
Handled in main
Connection terminated1

 */