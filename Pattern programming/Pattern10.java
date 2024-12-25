public class Pattern10 
{
    public static void main(String[] args) 
    {
        int i;
        int j;
        int k;
        
        for(i=1;i<=5;i++)
        {
            for(k=0;k<=i-1;k++)
            {
                System.out.print(" ");
            }
            for(j=1;j<=5-i+1;j++)
            {
                System.out.print("*");
            }
           
            System.out.println();
        }
    }
    
}


//output

/*

 *****
  ****
   ***
    **
     *
     
 */
