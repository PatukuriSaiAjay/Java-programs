public class String4
{
    public static void main(String args[])
    { 
        //String creation without using "new" keyword
        String s1= "JAVA";
        String s2= "PYTHON";
       
        //string concatination with references
        String s3= s1+s2;
        String s4= s1+s2;

        //printing the strings
        System.out.println(s3);
        System.out.println(s4);


        //checking references
        if(s3==s4)
        {
            System.out.println("String  address are equal");
        }
        else
        {
            System.out.println("String address are unequal");
        }

        //checking the values
        if(s1.equals(s2))
        {
            System.out.println("String values are equal");
        }
        else
        {
            System.out.println("String values are unequal");
        }
    }
}



//output

/*

JAVAPYTHON
JAVAPYTHON
String address are unequal
String values are unequal

 */
