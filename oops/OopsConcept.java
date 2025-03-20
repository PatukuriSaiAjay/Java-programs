import java.util.Scanner;
abstract class Shape
{
    float area;
    abstract void acceptInput();
  
    abstract void calculate();

    void output()
    {
        System.out.println("the area of the given shape:"+area);
    }
}

class Square extends Shape{

    private float size;
    
    @Override
    void acceptInput()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the size of the square:");
        size=scan.nextFloat();
    }
    @Override
    void calculate()
    {
        area= size*size;
    }
}

class Rectangle extends Shape{

    private float length;
    private float breadth;
    
    @Override
    void acceptInput()
    {
        Scanner scan=new Scanner(System.in);
        
        System.out.println("enter the length of the rectangle:");
        length=scan.nextFloat();

        System.out.println("enter the  breadth of the rectangle");
        breadth=scan.nextFloat();
    }
    @Override
    void calculate()
    {
        area= length*breadth;
    }
}


class Circle extends Shape{

    private float radius;
    private final float PI=3.142f;
    
    @Override
    void acceptInput()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the radius of the circle:");
        radius=scan.nextFloat();
    }
    @Override
    void calculate()
    {
        area=PI*radius*radius;
    }
}


class CalculateArea
{
    void display(Shape s)
    {
        s.acceptInput();
        s.calculate();
        s.output();
    }
}




class OopsConcept
{
    public static void main(String[] args) {
        
        Square sq=new Square();
        Rectangle r=new Rectangle();
        Circle c= new Circle();


        CalculateArea ca= new CalculateArea();

        ca.display(sq);
        ca.display(r);
        ca.display(c);

    }
}