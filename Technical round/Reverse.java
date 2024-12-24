import java.util.Scanner;
class Reverse
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();


       //using an algorithm
        /*int rev=0;
        while (n !=0)
        {
            rev=rev*10+n%10;
            n=n/10;
        }*/


        //using stringbuffer class
        /*  StringBuffer sb=new StringBuffer(String.valueOf(n));
        StringBuffer rev= sb.reverse();*/

        //using stringBuilder class

        StringBuilder sbl = new StringBuilder();
        sbl.append(n);
        StringBuilder rev= sbl.reverse();
        System.out.println("Reverse number is:" + rev);

    }

}