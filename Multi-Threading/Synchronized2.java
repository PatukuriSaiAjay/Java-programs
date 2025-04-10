

class Mobile
{
    synchronized void use()
    {
        try {
            System.out.println("Mobile taken by "+Thread.currentThread().getName());
            Thread.sleep(2000);
            System.out.println("Mobile is using  by "+Thread.currentThread().getName());
            Thread.sleep(5000);
            System.out.println("Mobile is left on table by "+Thread.currentThread().getName());
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}

class Father extends Thread
{
    Mobile mobile;
    @Override
    public void run() 
    {
        mobile.use();

    }

    public Father(Mobile mobile)
    {
        this.mobile= mobile;
    }
}

class Mother extends Thread
{
    Mobile mobile;
    @Override
    public void run() 
    {
        mobile.use();

    }
    public Mother(Mobile mobile)
    {
        this.mobile= mobile;
    }
}


class Child extends Thread
{
    Mobile mobile;
    @Override
    public void run() 
    {
        mobile.use();

    }
    public Child(Mobile mobile)
    {
        this.mobile= mobile;
    }
}


class Brother extends Thread
{
    Mobile mobile;
    @Override
    public void run() 
    {
        mobile.use();
    }
    public Brother(Mobile mobile)
    {
        this.mobile= mobile;
    }
}

public class Synchronized2 {
    public static void main(String[] args)
    {
        Mobile mobile= new Mobile();

        Father father= new Father(mobile);
        Mother mother = new Mother(mobile);
        Brother brother= new Brother(mobile);
        Child child= new Child(mobile);

        father.setName("Father");
        mother.setName("Mother");
        brother.setName("Brother");
        child.setName("Child");

        father.start();
        mother.start();
        brother.start();
        child.start();
    }
}
