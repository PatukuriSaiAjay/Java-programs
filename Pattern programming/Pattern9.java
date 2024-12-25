public class Pattern9 
{
    public static void main(String[] args) 
    {
        int i;
        int j;
        int k;
        
        for(i=1;i<=5;i++)
        {
            for(k=0;k<=5-i;k++)
            {
                System.out.print(" ");
            }
            for(j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}



//output

/*

     *
    **
   ***
  ****
 *****
 
 */