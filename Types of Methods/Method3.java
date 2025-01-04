class Calculator
{
 int c;
 
 void add(int a, int b)
 {
   c=a+b;
   System.out.println("addition:" +c);
   }
   
    void sub(int a, int b)
 {
   c=a-b;
   System.out.println("subtraction:" +c);
   }
   
    void mul(int a, int b)
 {
   c=a*b;
   System.out.println("multiplication:" +c);
   }
   
    void div(int a, int b)
 {
   c=a/b;
   System.out.println("division:" +c);
   }
   
    void mod(int a, int b)
 {
   c=a%b;
   System.out.println("modulus:" +c);
   }
}   
public class Method3 
{
	public static void main(String[] args) 
	{
		Calculator calc= new Calculator();
		int num1=40;
		int num2=30;
		calc.add(num1,num2);
		calc.sub(num1,num2);
		calc.mul(num1,num2);
		calc.div(num1,num2);
		calc.mod(num1,num2);
	}
}

//input- no output method

/*

addition:70
subtraction:10
multiplication:1200
division:1
modulus:10


*/