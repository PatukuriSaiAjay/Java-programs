import java.util.Scanner;

public class Array1
{
	public static void main(String[] args) 
	{
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the no.of students:");
		int n=scan.nextInt();
		int[] arr=new int[n];
		
		for(int i=0;i<n;i++)
		{
		    System.out.println("enter the ages of " +i +"'th student:");
		    arr[i]=scan.nextInt();
		}
		
		System.out.println("The ages of the student:");
		
		for(int i=0;i<n;i++)
		{
		    System.out.print(arr[i] + " ");
		}
	}
}

//example of an output of an array

/*

Enter the no.of students:
5
enter the ages of 0'th student:
20
enter the ages of 1'th student:
21
enter the ages of 2'th student:
22
enter the ages of 3'th student:
23
enter the ages of 4'th student:
22
The ages of the student:
20 21 22 23 22

*/