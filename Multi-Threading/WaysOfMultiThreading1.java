
import java.util.Scanner;

class Demo1 extends Thread{

    @Override
    public void run() {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the number1:");
        int a= scan.nextInt();
        System.out.println("Enter the number2:");
        int b= scan.nextInt();

        System.out.println(a+b);
    }
}

class Demo2 extends Thread
{

    @Override
    public void run() {
       System.out.println("printing the charachters");

       for(int i=65;i<=69;i++)
       {
        System.out.println((char)i);
        try {
            
            Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
        }
       }
       System.out.println("charachters are ended");
    }
    
}

class Demo3 extends Thread{

    @Override
    public void run() {
        System.out.println("printing the numbers");

        for(int i=1;i<10;i++)
        {
            System.out.println(i);
            try {
            
                Thread.sleep(3000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println("Ending the numbers");
    }
    
}
 
 
 
 public class WaysOfMultiThreading1 {
    public static void main(String[] args){
        Demo1 d1=new Demo1();
        Demo2 d2= new Demo2();
        Demo3 d3= new Demo3();

        d1.start();
        d2.start();
        d3.start();
    }
}
