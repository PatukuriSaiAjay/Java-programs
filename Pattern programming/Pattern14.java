import java.util.Scanner;

public class Pattern14 
{
    public static void main(String[] args) 
    {
        int i;
        int j;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:");
        int n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
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