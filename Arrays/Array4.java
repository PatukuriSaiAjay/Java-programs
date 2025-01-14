// create an array to store 2 class student age in one class 3 students and another class 5 students

// two dimensional jagged array

import java.util.Scanner;
public class Array4 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		int[][] a= new int[2][];
		a[0]=new int[3];
		a[1]=new int[5];
		
   //storing
        
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                System.out.println("Enter the age of " + (i+                             1) + " class " +(j+1) + " student: ");
                a[i][j]=scan.nextInt();
            }
        }
        
        System.out.println("The ages of the student:");
        //printing
        
           for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        
    }
}

//output

/*

Enter the age of 1 class 1 student:
20
Enter the age of 1 class 2 student:
21
Enter the age of 1 class 3 student:
23
Enter the age of 2 class 1 student:
21
Enter the age of 2 class 2 student:
22
Enter the age of 2 class 3 student:
23
Enter the age of 2 class 4 student:
24
Enter the age of 2 class 5 student:
25
The ages of the student:
20 21 23
21 22 23 24 25

*/