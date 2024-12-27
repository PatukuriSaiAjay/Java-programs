import java.util.Scanner;

public class Pattern17 
{
    public static void main(String[] args) 
    {
        int i;
        int j;
        int k;
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:");
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            for(k=0;k<=n-i;k++)
            {
                System.out.print(" ");
            }
            for(j=1;j<=i;j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }
    
}


//output

/*

enter a number:
5
     1
    22
   333
  4444
 55555
 
 */