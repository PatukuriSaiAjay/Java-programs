

class Plane
{
    void takeoff()
    {
        System.out.println("Plane is taking off");
    }

    void fly()
    {
        System.out.println("Plane is flying");
    }
}

class CargoPlane extends Plane
{

    @Override
    void fly() {
        System.out.println("CargoPlane is flying at lower height");
    }
    
    void carryGoods()
    {
        System.out.println("CargoPlane is carryong goods");
    }
}


class PassengerPlane extends Plane
{

    @Override
    void fly() {
        System.out.println("Passenger Plane is flying at medium Height");
    }

    void carryPassengers()
    {
        System.out.println("PassengerPlane is carrying Passengers");
    }
    
}


class FighterPlane extends Plane{

    @Override
    void fly() {
       System.out.println("FighterPlane flies at any height");
    }
    
    void carryWeapons()
    {
        System.out.println("FighterPlanes carries weapons");
    }
}


public  class Polymorphism{
    public static void main(String[] args)
    {
        Plane ref;

        CargoPlane cp=new CargoPlane();
        PassengerPlane pp=new PassengerPlane();
        FighterPlane fp=new FighterPlane(); 

        ref=cp;
        ref.takeoff();
        ref.fly();

        ref=pp;
        ref.takeoff();
        ref.fly();

        ref=fp;
        ref.takeoff();
        ref.fly();
        
    }
}