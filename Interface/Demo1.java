@FunctionalInterface
interface display
{
    void add();
}


class Ajay implements display{
    @Override
    public void add()
    {
        System.out.println(10+20);
    }
}
class Demo1
{
    public static void main(String[] args) {
        
        Ajay a= new Ajay();
        a.add();
    }
}