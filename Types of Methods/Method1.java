class Calculater
{
    int a=30 ;
    int b=20 ;
    void add()
    {
        int c=a+b;
        System.out.println("addition:" +c);
      }
      void sub()
    {
        int d=a-b;
        System.out.println("subtraction:" +d);
      }
      void mul()
    {
        int e=a*b;
        System.out.println("multiplication:" +e);
      }
      void div()
    {
        int f=a/b;
        System.out.println("division:" +f);
      }
      void mod()
    {
        int g=a%b;
        System.out.println("modulus:" +g);
      }
 }
 
   class Method1
{
   public static void main(String[] args) 
    {
        
     Calculater calc=new Calculater();
     calc.add();
     calc.sub();
     calc.mul();
     calc.div();
     calc.mod();
    }
 }
    
    
    //no input -no output method
    
    /*
 
 addition:50
subtraction:10
multiplication:600
division:1
modulus:10


*/