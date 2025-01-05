class Car
{
    String name;
    int noOfSeats;
    float cost;
}


public class Reference 
{
	public static void main(String[] args) 
	{
		Car a= new Car();
		a.name="Maruthi";
		a.noOfSeats=5;
		a.cost=8.66f;
		
		System.out.println(a.name);
		System.out.println(a.noOfSeats);
		System.out.println(a.cost);
		
		Car b;
		b=a;
		b.name="ferrari";
		b.noOfSeats=4;
		b.cost=15.50f;
		
		System.out.println(a.name);
		System.out.println(a.noOfSeats);
		System.out.println(a.cost);
		
	}
}


//pass by reference

/*

Maruthi
5
8.66
ferrari
4
15.5

*/