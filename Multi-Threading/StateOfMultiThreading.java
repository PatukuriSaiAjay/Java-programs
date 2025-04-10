//Life cycle of Multi-Threading
class Warrior extends Thread
{
    String res1="Bramahstra";
    String res2="Pasupashtra";
    String res3="Sarpasthra";

    @Override
    public void run()
    {

        if(Thread.currentThread().getName().equals("ARJUNA"))
        {
            arjuna();
        }
        else{
            karna();
        }
    }

    public void arjuna()
    {
        try {
            Thread.sleep(3000);
            synchronized(res1)
            {
                System.out.println("Arjuna acquired "+res1);
                synchronized(res2)
                {
                    Thread.sleep(3000);
                    System.out.println("Arjuna acquired "+res2);
                    synchronized(res3)
                    {
                        Thread.sleep(3000);
                        System.out.println("Arjuna acquired "+res3);
                    }
                }
            }        
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void karna()
    {
        try {
            Thread.sleep(3000);
            synchronized(res1)
            {
                System.out.println("Karna acquired "+res1);
                synchronized(res2)
                {
                    Thread.sleep(3000);
                    System.out.println("Karna acquired "+res2);
                    synchronized(res3)
                    {
                        Thread.sleep(3000);
                        System.out.println("Karnaa acquired "+res3);
                    }
                }
            }        
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


public class StateOfMultiThreading
{
    public static void main(String[] args) {
        
        Warrior w1= new Warrior();
        Warrior w2= new Warrior();

        w1.setName("ARJUNA");
        w2.setName("KARNA");

        w1.start();
        w2.start();
    }
}