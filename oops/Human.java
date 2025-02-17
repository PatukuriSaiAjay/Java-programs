class Heart
{
    private int weight;
    private int bpm;

    public Heart(int bpm, int weight) {
        this.bpm = bpm;
        this.weight = weight;
    }
    
    
    public int getWeight() {
        return weight;
    }

    public int getBpm() {
        return bpm;
    }


}

class Brain
{
   private int weight;
   private String colour;

    public Brain(int weight,String colour) {
        this.colour = colour;
        this.weight = weight;
    }


   
    public int getWeight() {
        return weight;
    }



    public String getColour() {
        return colour;
    }


}
    class Bike
    {
        private String brand;
        private float milage;

    public Bike(String brand, float milage) {
        this.brand = brand;
        this.milage = milage;
    }

        

        public String getBrand()
        {
            return brand;
        }

        public float getMilage() {
            return milage;
        }

  


    }

    class Book
    {
        private String name;
        private String author;

    public Book(String author, String name) {
        this.author = author;
        this.name = name;
    }



    public String getName() {
        return name;
    }
    public String getAuthor() {
        return author;
    }

 


    }


    class HumanBeing {
        Heart h=new Heart(200,82);
        Brain b=new Brain(1200,"grayish");
        void hasA(Bike bi)
        {
            System.out.println(bi.getBrand());
            System.out.println(bi.getMilage());
        }

        void hasB(Book bo)
        {
            System.out.println(bo.getName());
            System.out.println(bo.getAuthor());
        }
    }

public class Human {
    
    public static void main(String[] args) {
        
        Bike bi= new Bike("Royal Enfield",35.0f);
        Book bo=new Book("sri sri", "Maha prasthanam");

        HumanBeing hb=new HumanBeing();
        //human being is alive
  
        System.out.println(hb.h.getWeight());
        System.out.println(hb.h.getBpm());
        System.out.println(hb.b.getWeight());
        System.out.println(hb.b.getColour());

        hb.hasA(bi);
        hb.hasB(bo);

        //human being is died
        hb=null;
        System.out.println(hb.h.getWeight());
        System.out.println(hb.h.getBpm());
        System.out.println(hb.b.getWeight());
        System.out.println(hb.b.getColour());

        //direct using object refernces
        System.out.println(bi.getBrand());
        System.out.println(bi.getMilage());

        System.out.println(bo.getName());
        System.out.println(bo.getAuthor());
    }
}
