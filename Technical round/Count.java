//count the number of digits in a given number
import java.util.Scanner;

class Count
{
    public static void main(String[] args) {
        
     Scanner scan=new Scanner(System.in);
     int n=scan.nextInt();

     //calling the method
     int res=countOfDigits(n);
     System.out.println(res);
        
    }
    public static int countOfDigits(int n)
    {
        //initializing the count value=0
        int count=0;

        
            //Removing the last number and writing in loop
            while(n>0)
            {
                n=n/10;
                count++;
            }
        
        return count;

    }
}

//output
//2345
//4