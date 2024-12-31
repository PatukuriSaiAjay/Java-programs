class Typecast{
    public static void main(String[] args) 
    {
        //convert small data type to large data type
        //implicit type casting

        byte a=21;
        double b;
        b=a;
        System.out.println(a);
        System.out.println(b);

        //conert large data type to small data type
        //explicit type casting

        double c=44.45;
        byte d;
        d=(byte)c;
        System.out.println(c);
        System.out.println(d);


        //convert charachter data type to number data type
        //implicit type casting
        //example 1

        char e='A';
        int n;
        n=e;
        System.out.println(e);
        System.out.println(n);

        //example 2

        char f='0';
        int m;
        m=f;
        System.out.println(f);
        System.out.println(m);

        //convert charachter data type to number data type
        //explicit  type casting
        
        int l=65;
        char g;
        g=(char)l;
        System.out.println(l);
        System.out.println(g);
    

    }
}

//output:

/*

21
21.0
44.45
44
A
65
0
48
65
A

 */