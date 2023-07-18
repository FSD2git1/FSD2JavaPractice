 package demopackage;

public class practLoops {
   public static void main(String[] args) {
	  for (int i=1; i<=50; i++)
	  {
		  System.out.println("Hello World");
	  }
	  // First pattern of star
	  for (int i=1; i<=5; i++)
	   {
		  
		   for (int j=1; j<=i; j++)
		   {
			   System.out.print("*");
		   }
		   
		  System.out.println();  
	   
	   }
	   
	   //Second pattern in star 
	   /*for (int i=5; i>=1; i--) 
	   {
		   for(int j=1; j<=i; j++)
		   {
			   System.out.print("*");
		   }
		   
		   System.out.println();
	   }*/
	   
	   //Third pattern 
	   /*int row=10;
	   for(int i=1; i<=row; i++)
	   {
		   for(int k=row; k>i; k--)
		   {
			   System.out.print(" ");
		   }
		   for(int j=1; j<=i; j++)
		   {
			   System.out.print("*");
		   }
		   System.out.println();
	   }*/
	   
	   
	   
	 
	  
   }
}
