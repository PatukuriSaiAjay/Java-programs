@FunctionalInterface
interface display
{
    void add();
}

public class Demo2 {
    public static void main(String[] args) {
        
        class Ajay implements display{
            @Override
            public void add()
            {
                System.out.println(10+20);
            }
        }
        Ajay a= new Ajay();
        a.add();

    }   
}
