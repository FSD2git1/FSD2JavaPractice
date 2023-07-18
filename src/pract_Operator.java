
public class pract_Operator {
public static void main(String[] args) {
	int a=10;
	int b=15;
	//Addition
	int c=a+b;
	System.out.println(c);
	
	byte b1=40;
	byte b2=2;
	
	//byte b3=b1+b2;  //it is not capability to change the operation in byte thats why it is getting error.
	
	
	short s1=30;
	short s2=40;
	int  s3=s1+s2; //
	//System.out.println(b3);
	
	//Subtraction
	int d=a-b;
	System.out.println(d);
	
	//Multiplication
	int e=a*b;
	int g=a*30;
	System.out.println(e);
	
	//Division
	int f = a/3;
	
	float i=10;  //Always add in fractional values like 10.00,3.00
	float j=3;
	float k=i/j;
	
	System.out.println(f);
     //Modulus
	int m=a%3;
	System.out.println(m);
	
	//Incremental Operator(++)
	System.out.println(++a);
	
	// 3. Relational operator(comparison operator)
	
	// 1. Greater than(>)
	int x=30;
	int y=70;
	boolean result= x>y;  //Y/N  
	System.out.println(result);
	boolean result2=x<y;
	System.out.println(result2);
	 x =40;
     y=40;
	boolean result3=x==y;
	System.out.println(result3);
	
}
}
