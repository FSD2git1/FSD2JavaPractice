package demopackage;

public class Test {

	
	public static void main(String[] args) {
	
		//Implicit
		int a=10;
		float b=a;
		System.out.println(b);
		float r=1000.30f;
		double amount=2000;
		
		//Explicit 	
		int e=127;          //in one combination integer store -128 to 127		byte f=(byte)e;    //-128 to 127  -128 127 126 ...0,  1,  2,...127
		                    //       127 128  129  130   (256 combination in come byte) 
		
		System.out.println(e);
		
		
	float p=20.40f;
	int q=(int)p;
	System.out.println(q);
		
     }
}
