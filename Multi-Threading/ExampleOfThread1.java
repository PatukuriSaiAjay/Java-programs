
import java.util.Scanner;

class Demo1 extends Thread
{

    @Override
    public void run() {
        Scanner scan= new Scanner(System.in);
        System.out.println("Adding two number is started");
        System.out.println("Enter the first number");
        int a= scan.nextInt();
        System.out.println("Enter the second number");
        int b= scan.nextInt();
        System.out.println(a+b);
        System.out.println("Adding two number is completed");
    }
    
}

class Demo2 extends  Thread
{

    @Override
    public void run() {
       
        System.out.println("print the charachters");

        try {
            for(int i=65;i<70;i++)
            {
                System.out.println((char)i);
                
                Thread.sleep(3000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(" the charachters are printed ");
    }

    
}

class Demo3 extends  Thread
{

    @Override
    public void run() {
       
        System.out.println("print the numbers");

        try {
            for(int i=1;i<6;i++)
            {
                System.out.println(i);
                Thread.sleep(3000);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("numbers are printed");
    }

    
}


public class ExampleOfThread1 {
    public static void main(String[] args)
    {
        Demo1 d1= new Demo1();
        Demo2 d2= new Demo2();
        Demo3 d3= new Demo3();

        d1.start();
        d2.start();
        d3.start();
    }
}
