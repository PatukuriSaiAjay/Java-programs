import java.util.Scanner;
class Array1
{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
int[] a=new int[5];
for(int i=0;i< a.length;i++)
{
System.out.println("enter the age");
a[i]=scan.nextInt();
}
System.out.println("THE AGES ARE:");
for(int i=0;i<a.length;i++)
{
System.out.println(a[i]);
}
}
}