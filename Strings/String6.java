

public class String6 
{
    public static void main(String[] args) 
    {
        //create a string without using java
        String s1="JAVA";
        String s2="JAMES";

        //comparing values
        int n=s1.compareTo(s2);
        System.out.println(n);
        if(n>0)
        {
            System.out.println("s1 is greater than s2");
        }
        else if(n<0)
        {
            System.out.println("s1 is less than s2");
        }
        else
        {
            System.out.println("s1 is equal to s2");

        }
    }    
}

//Output
/*

9
s1 is greater than s2

 */