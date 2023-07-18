package newPackage;

public class pract_Constructor {

	
	int t;
	int s;
	int x;
	public pract_Constructor() 
	{
		 t=10;
		 s=90;
		 x=100;
		 //System.out.println(t);
	}
	
	public pract_Constructor(int a) 
	{
		 t=30;
		 s=90;
		 x=200;
		 //System.out.println(t);
	}
	public pract_Constructor(String a) 
	{
		 t=40;
		 s=20;
		 x=300;
		 //System.out.println(t);
	}
	
	//static int pract_Constructor=10;
	public static void main(String[] args) {
		
		pract_Constructor p=new pract_Constructor();
		System.out.println(p.t);
		System.out.println(p.s);
		System.out.println(p.x);
		
		System.out.println("-------------------------");
		pract_Constructor q=new pract_Constructor(10);
		System.out.println(q.t);
		System.out.println(q.s);
		System.out.println(q.x);
		
		//new pract_Constructor();   //constructor calling 
	}
}
