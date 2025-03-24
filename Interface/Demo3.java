@FunctionalInterface
interface display
{
    void add();
}


public class Demo3 {
    public static void main(String[] args) {

        display a=new display(){
            public void add()
            {
                System.out.println(10+20);
            }        
        };
        a.add();
    }
}
