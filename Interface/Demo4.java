@FunctionalInterface
interface display
{
    void add();
}


public class Demo4 {
    public static void main(String[] args) {
    
        display a=()->{System.out.println(10+20);};
        a.add();
    
    }
}
