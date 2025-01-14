//two dimensional array

import java.util.Scanner;

class Array2
{
    public static void main(String args[])
    {
        int m,n;
        
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter the no.of classes:");
        m=scan.nextInt();
        System.out.println("Enter the no.of students:");
        n=scan.nextInt();
        
        int [][] a= new int[m][n];
        
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
Enter the no.of classes:
2
Enter the no.of students:
5
Enter the age of 1 class 1 student:
20
Enter the age of 1 class 2 student:
21
Enter the age of 1 class 3 student:
22
Enter the age of 1 class 4 student:
23
Enter the age of 1 class 5 student:
24
Enter the age of 2 class 1 student:
24
Enter the age of 2 class 2 student:
23
Enter the age of 2 class 3 student:
22
Enter the age of 2 class 4 student:
21
Enter the age of 2 class 5 student:
20
The ages of the student:
20 21 22 23 24
24 23 22 21 20

*/