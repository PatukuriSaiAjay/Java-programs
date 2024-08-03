public class Pattern7
{
    public static void main(String[] args)
    {
        int count=1;
        int n=5;
        for (int i = 0; i<=n-1; i++) 
        {
            for (int j = 0; j<=n-1; j++)
            {
                if(count<10)
                {
                    System.out.print("0");
                }
            System.out.print(count++ + " ");
            }
            System.out.println();
        }
    } 
}


/* 
01 02 03 04 05
06 07 08 09 10
11 12 13 14 15
16 17 18 19 20
21 22 23 24 25
*/  
