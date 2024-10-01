import java.util.Scanner;
class Array3
{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
int[][][] a=new int[2][3][5];
for (int i=0;i<a.length-1;i++)
{
for(int j=0;j<a[i].length-1;j++)
{
for(int k=0;k<a[i][j].length-1;k++)
{
System.out.println("enter the student age in schools " + i + " classes  " +j +" students " +k);
a[i][j][k]=scan.nextInt();
}
}
}
System.out.println("the student ages in classroom:");
for (int i=0;i<a.length-1;i++)
{
for(int j=0;j<a[i].length-1;j++)
{
for(int k=0;k<a[i][j].length-1;k++)
{
System.out.println(a[i][j][k]);
}
}
}
}
}
