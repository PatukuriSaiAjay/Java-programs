import java.util.Scanner;

public class Pattern15 
{
    public static void main(String argsss[])
    {
        int i;
        int j;
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
       

        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(i==0 ||j==0 ||i==n-1 ||j==n-1 ||i==n/2 || j==n/2 ||i==j 
                || (i+j)==n-1 || (i+j)==n/2 || (i-j)==n/2 ||(i+j) == (n-1)+(n/2) || (j-i)==n/2 )
                {
                    System.out.print("*" + " ");
                }
                else
                {
                    System.out.print(" " + " ");

                }
            }
            System.out.println();
        }
    }
    
}


//output

/*

Enter a number:
15
* * * * * * * * * * * * * * * 
* *         * * *         * *
*   *     *   *   *     *   * 
*     * *     *     * *     *
*     * *     *     * *     *
*   *     *   *   *     *   *
* *         * * *         * * 
* * * * * * * * * * * * * * *
* *         * * *         * *
*   *     *   *   *     *   *
*     * *     *     * *     *
*     * *     *     * *     *
*   *     *   *   *     *   * 
* *         * * *         * *
* * * * * * * * * * * * * * *

 
 */
