public class String2
{
    public static void main(String args[])
    { 
        //String creation with using "new" keyword
        String s1= new String( "JAVA");
        String s2= new String( "PYTHON");
       
        //string concatination with values
        String s3= "JAVA"+"PYTHON";
        String s4= "JAVA"+"PYTHON";

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
String address are equal
String values are unequal

 */