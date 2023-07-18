package demopackage;

//import java.util.Scanner;

public class Thirdstarpattern {
	public static void main(String[] args) {
		int row=10;
		for(int i=1; i<=row; i++)
		{
			for(int j=row; j>i; j--)
			{
				System.out.print(" ");
			}
			for (int j=1; j<=i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
		//Triangle pattern in odd format
		/*int row=10;
		for(int i=1; i<=row; i++)
		{
			for(int j=row; j>i; j--)
			{
				System.out.print(" ");
			}
			for (int j=1; j<=(2*i -1); j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}*/
		
		
		/*int n,i,j,space=1;
		System.out.println("Enter the number of rows; ");
		Scanner s=new Scanner (System.in);
		n=s.nextInt();
		space=n-1;
		for( j = 1; j<=n;j++)
		{
		for(i=1; i<=space; i++)
		{
			System.out.print(" ");
		}
		space--;
		for(i=1; i<=2*j-1;i++)
		{
			System.out.print("*");
		}
		System.out.println("");
		}
		space=1;
		for(j=1;j<=n-1;j++)
		{
         for(i=1;i<=space;i++)
         {
        	 System.out.print(" ");
         }
         space++;
         for(i=1;i<=2*(n-j)-1;i++)
         {
        	 System.out.print("*");
         }
         System.out.println("");
		}*/
		
	}
}
