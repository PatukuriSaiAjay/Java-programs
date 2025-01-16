
class Dog
{
    String name;
  int age;
  float cost;
    
}
public class Array9
{
	public static void main(String[] args)
	 {
	 
	 Dog d1=new Dog();
     Dog d2=new Dog();
	 Dog d3=new Dog();
	Dog[] d=new Dog[3];
	
	d1.name ="Tommy";
	d1.age=12;
	d1.cost=10.5f;
	
	d2.name ="Maxy";
	d2.age=15;
	d2.cost=15.4f;
	
	d3.name="chichu";
	d3.age=14;
	d3.cost=13.5f;

    d[0]=d1;
    d[1]=d2;
    d[2]=d3;

    for(int i=0;i<d.length;i++)
    {
	 System.out.println(d[i].name);
	 System.out.println(d[i].age);
	 System.out.println(d[i].cost);
	 System.out.println();
    }
	
			
  	}
}


//output

/*

Tommy
12
10.5

Maxy
15
15.4

chichu
14
13.5


[Program finished]
*/