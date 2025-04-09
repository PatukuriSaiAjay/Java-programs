
class Captain extends Thread
{

    @Override
    public void run() {
       try {

        BattingCoach bac= new BattingCoach();
        BowlingCoach boc= new BowlingCoach();

        bac.setDaemon(true);
        boc.setDaemon(true);


        bac.start();
        boc.start();

        System.out.println("Captain is entering at ground");
        Thread.sleep(2000);
        System.out.println("Captain is doing warm-up");
        Thread.sleep(2000);
        System.out.println("Captain practices fielding");
        Thread.sleep(2000);
        System.out.println("Captain practices Bowling");
        Thread.sleep(2000);
        System.out.println("Captain practics Batting");
        Thread.sleep(3000);
       } catch (Exception e) {
        e.printStackTrace();
       }
    }
}

class BattingCoach extends Thread
{

    @Override
    public void run() {
       for( ; ; )
       {
        try{
            System.out.println("Batting Coach helps to practising Batting");
            Thread.sleep(3000);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
       }
    }
    
}

class BowlingCoach extends Thread
{

    @Override
    public void run() {
       for( ; ; )
       {
        try{
            System.out.println("Bowling Coach helps to practising Bowling");
            Thread.sleep(3000);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
       }
    }
    
}




public class DeamonThread
{
    public static void main(String[] args) {
        
        Captain dhoni=new Captain();
        dhoni.start();
    }
}