import javax.print.attribute.standard.MediaSize.Other;

class BathRoom
{
    synchronized public void bathRoom()
    {
     try
     {

        System.out.println(Thread.currentThread().getName()+" is entering");
        Thread.sleep(3000);
        System.out.println(Thread.currentThread().getName()+" is using");
        Thread.sleep(3000);
        System.out.println(Thread.currentThread().getName()+" is exit");

     } catch (Exception e) {
        e.printStackTrace();
     }
    }
}

class Boy extends Thread
{
    BathRoom bathroom;
    @Override
    public void run()
    {
        bathroom.bathRoom();
    }

    public Boy(BathRoom bathroom)
    {
        this.bathroom=bathroom;
    }
}

class Girl extends Thread
{
    BathRoom bathroom;
    @Override
    public void run()
    {
      bathroom.bathRoom();
    }
    public Girl(BathRoom bathroom)
    {
        this.bathroom=bathroom;
    }

}

class Others extends Thread
{
    BathRoom bathroom;
    @Override
    public void run()
    {
        bathroom.bathRoom();

    }
    public Others(BathRoom bathroom)
    {
        this.bathroom=bathroom;
    }
}



public class Synchronized {
    public static void main(String[] args) {
        BathRoom bathroom= new BathRoom();

        Boy boy= new Boy(bathroom);
        Girl girl= new Girl(bathroom);
        Others others= new Others(bathroom);

        boy.setName("Boy");
        girl.setName("Girl");
        others.setName("Others");
        
        boy.start();
        girl.start();
        others.start();
    }
}
