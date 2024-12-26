import java.util.Scanner;

public class Pattern13 {
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
                System.out.print(j);
            }
            System.out.println();
        }
        
    }
    
}

//output

/*

enter a number:
5
12345
12345
12345
12345
12345

 */