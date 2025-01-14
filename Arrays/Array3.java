//three dimensional array

import java.util.Scanner;
public class Array3 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the no.of schools:");
		int m=scan.nextInt();
		System.out.println("Enter the no.of classes:");
		int n=scan.nextInt();
		System.out.println("Enter the no.of students:");
		int l=scan.nextInt();
		
		int[][][] a= new int[m][n][l];
		// store 
		
		for (int i=0;i<a.length;i++)
		{
		    for(int j=0;j<a[i].length;j++)
		    {
		        for(int k=0;k<a[i][j].length;k++)
		        {
		            System.out.println("Enter the age of "+ (i+                         1)+ " school " +(j+1)+" class " + (k+1) + " student :");
		            a[i][j][k]=scan.nextInt();
		        }
		    }
		}
           // printing
 System.out.println("The ages of the student: ");
        for (int i=0;i<a.length;i++)
    	{
	        for(int j=0;j<a[i].length;j++)
    	    {
	           for(int k=0;k<a[i][j].length;k++)
    		       {
		            System.out.print(a[i][j][k]+" ");
    		        }
	    	        System.out.println();
    	   }
    		    System.out.println();
		}
	}
}

//output

/*

Enter the no.of schools:
2
Enter the no.of classes:
2
Enter the no.of students:
5
Enter the age of 1 school 1 class 1 student :
20
Enter the age of 1 school 1 class 2 student :
21
Enter the age of 1 school 1 class 3 student :
22
Enter the age of 1 school 1 class 4 student :
23
Enter the age of 1 school 1 class 5 student :
24
Enter the age of 1 school 2 class 1 student :
25
Enter the age of 1 school 2 class 2 student :
26
Enter the age of 1 school 2 class 3 student :
27
Enter the age of 1 school 2 class 4 student :
28
Enter the age of 1 school 2 class 5 student :
29
Enter the age of 2 school 1 class 1 student :
30
Enter the age of 2 school 1 class 2 student :
31
Enter the age of 2 school 1 class 3 student :
32
Enter the age of 2 school 1 class 4 student :
33
Enter the age of 2 school 1 class 5 student :
34
Enter the age of 2 school 2 class 1 student :
35
Enter the age of 2 school 2 class 2 student :
36
Enter the age of 2 school 2 class 3 student :
37
Enter the age of 2 school 2 class 4 student :
38
Enter the age of 2 school 2 class 5 student :
39
The ages of the student:
20 21 22 23 24
25 26 27 28 29

30 31 32 33 34
35 36 37 38 39


*/