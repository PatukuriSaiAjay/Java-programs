import java.util.Scanner;

public class Pattern16 
{
    public static void main(String args[])
    {
        int i;
        int j;
        int n;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a number:");
        n=sc.nextInt();

        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n-i+1;j++)
            {
                System.out.print(n-i+1);
            }
            System.out.println();
        }
    }
    
}


//output

/*

enter a number:
5

55555
4444
333
22
1

 */