class Calculator
{
    int c;
    
    int add(int a,int b)
    {
     c=a+b;
     return c;
     }
     
    int sub(int a,int b)
    {
     c=a-b;
     return c;
     }
     
      int mul(int a,int b)
    {
     c=a*b;
     return c;
     }
     
      int div(int a,int b)
    {
     c=a/b;
     return c;
     }
     
      int mod(int a,int b)
    {
     c=a+b;
     return c;
     }
}

public class Method4
 {
	public static void main(String[] args) 
	{
		Calculator calc=new Calculator();
		int num1=20;
		int num2=10;
		int add=calc.add(num1,num2);
		int sub=calc.sub(num1,num2);
		int mul=calc.mul(num1,num2);
		int div=calc.div(num1,num2);
		int mod=calc.mod(num1,num2);
		System.out.println("addition:" +add);
		System.out.println("substraction:" +sub);
		System.out.println("multiplication" +mul);
		System.out.println("division:" +div);
		System.out.println("modulus:" +mod);
	}
}

//input-output method

/*

addition:30
substraction:10
multiplication200
division:2
modulus:30

*/