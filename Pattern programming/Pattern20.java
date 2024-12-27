import java.util.Scanner;

public class Pattern20 
{
    public static void main(String[] args) 
    {
        int i;
        int j;
        int k;
        int n;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number:");
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            for(k=1;k<=i;k++)
            {
                System.out.print(" ");
            }
            for(j=1;j<=2*(n-i+1)-1;j++)
            {
                System.out.print((n-i+1));
            }
            System.out.println();
        }
        
    }
    
}

//output

/*

Enter a number:
5
 555555555
  4444444
   33333
    222
     1

 */