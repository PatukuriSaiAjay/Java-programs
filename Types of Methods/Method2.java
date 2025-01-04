class Calculator
{
    int a=50;
    int b=40;
    int add()
    {
        int c=a+b;
        return c;
    }
    int sub()
    {
        int d=a-b;
        return d;
    }
     int mul()
    {
        int e=a*b;
        return e;
    }
     int div()
    {
        int f=a/b;
        return f;
    }
     int mod()
    {
        int g=a%b;
        return g;
    }
}

public class Method2
{
	public static void main(String[] args) 
	{
		Calculator calc=new Calculator();
		int add=calc.add();
		int sub=calc.sub();
		int mul=calc.mul();
		int div=calc.div();
		int mod=calc.mod();
	    System.out.println("addition:" +add);
		System.out.println("substraction:" +sub);
		System.out.println("multiplication" +mul);
		System.out.println("division:" +div);
		System.out.println("modulus:" +mod);
	}
}

//no input- output method

/*

addition:90
substraction:10
multiplication2000
division:1
modulus:10


*/