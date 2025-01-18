public class String5 
{
    public static void main(String[] args) 
    {
        //create a string

        String s1="JAVA";
        String s2="PYTHON";

        //string concatination by using concat method
        String s3=s1.concat(s2);
        String s4=s2.concat(s1);

        //printing the string
        System.out.println(s3);
        System.out.println(s4);
        
    }
    
}


//output
/*

JAVAPYTHON
PYTHONJAVA

 */