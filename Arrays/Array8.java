public class Array8
{
	public static void main(String[] args) 
	{
	    int[][][] a={{{10,20,30,40,50},{60,70,80,90,100}},{{100,90,80,70,60},{50,40,30,20,10}}};
	    //printing
	    for(int i=0;i<a.length;i++)
	    {
	        for(int j=0;j<a[i].length;j++)
	        {
	            for(int k=0;k<a[i][j].length;k++)
	            {
	                System.out.print(a[i][j][k]+" ");
	            }
	            System.out.println();
	        }
	        System.out.println();
	        System.out.println();
	    }
	}
}

//output

/*

10 20 30 40 50
60 70 80 90 100


100 90 80 70 60
50 40 30 20 10

*/