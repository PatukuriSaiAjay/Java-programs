
class Hero extends Thread
{
    @Override
    public void run() 
    {
        StuntMan stunt= new StuntMan();
        MakeUpMan makeup=new MakeUpMan();

        stunt.setDaemon(true);
        makeup.setDaemon(true);

        stunt.start();
        makeup.start();
        
        try {
            System.out.println("Hero is entered into sets");
            Thread.sleep(3000);
            System.out.println("Hero is doing rahersals on sets");
            Thread.sleep(3000);
            System.out.println("Hero is done is acting on sets");
            Thread.sleep(3000);
            System.out.println("Hero is leaving the sets");
            Thread.sleep(3000);
        } catch (Exception e) {
            
            e.printStackTrace();
        }
    }
}


class Heroine extends Thread
{
    
    @Override
    public void run() 
    {
        StuntMan stunt= new StuntMan();
        MakeUpMan makeup=new MakeUpMan();

        stunt.setDaemon(true);
        makeup.setDaemon(true);

        stunt.start();
        makeup.start();
        try {
            System.out.println("Heroine is entered into sets");
            Thread.sleep(3000);
            System.out.println("Heroine is doing rahersals on sets");
            Thread.sleep(3000);
            System.out.println("Heroine is done is acting on sets");
            Thread.sleep(3000);
            System.out.println("Heroine is leaving the sets");
            Thread.sleep(3000);
        } catch (Exception e) {
            
            e.printStackTrace();
        }
    }
}


class StuntMan extends Thread
{
    @Override
    public void run() 
    {
        try {
            
           for( ; ; )
           {
            System.out.println("Stunt Man helps to actors");
            Thread.sleep(3000);
           }
        } catch (Exception e) {
           e.printStackTrace();
        }
    }
}

class MakeUpMan extends Thread
{
    @Override
    public void run() 
    {
        try {
            
            for( ; ; )
            {
             System.out.println("MakeUp Man helps to actors");
             Thread.sleep(3000);
            }
         } catch (Exception e) {
            e.printStackTrace();
         }

    }
}

public class DeamonThread2 {
    public static void main(String[] args) {
        
        Hero hero= new Hero();
        Heroine heroine= new Heroine();

        hero.start();
        heroine.start();
    }
}
