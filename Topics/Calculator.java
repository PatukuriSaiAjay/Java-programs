import java.util.Scanner;

public class Calculator 
{
	public static void main(String[] args) 
	{
		 Scanner scan=new Scanner(System.in);
		 System.out.println("Enter the first number:");
		 int a=scan.nextInt();
		 System.out.println("Enter the second number:");
		 int b =scan.nextInt();
		 int sum= a+b;
		 int sub=a-b;
		 int mul=a*b;
		 int div=a/b;
		 int mod=a%b;
		 System.out.println("sum of two numbers:" +sum);
		  
          System.out.println("subtraction  of two numbers:" +sub);
		  	  
       System.out.println("Multiplication of two numbers:" +mul);
		  	  	  
	   System.out.println("Division of two numbers:" +div);
		   
		 	  System.out.println("modulus of two numbers:" +mod);
	}
}


//example of output


/*

Enter the first number:
10
Enter the second number:
20
sum of two numbers:30
subtraction  of two numbers:-10
Multiplication of two numbers:200
Division of two numbers:0
modulus of two numbers:10

*/
