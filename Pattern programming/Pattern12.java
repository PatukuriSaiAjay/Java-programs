import java.util.Scanner;

public class Pattern12 {
    public static void main(String[] args) 
    {
        int i;
        int j;
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:");
        n=sc.nextInt();

        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
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
11111
22222
33333
44444
55555

 */
