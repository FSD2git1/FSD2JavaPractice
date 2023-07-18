package demopackage;

public class AmstrongNo {
	//The Armstrong number is a positive m-digit number that is equal to the sum of the mth power of their digits.
	
	 //3 Digit number with while loop
	/*public static void main(String[] args) {
		int num=153,originalNum,remainder,result=0;
	
	originalNum=num;
	while(originalNum !=0)
	{
		remainder =originalNum % 10;
		result+=Math.pow(remainder, 3);
		originalNum /=10;
	}
	if(result==num)
		System.out.println(num+ " is an Armstrong Number.");
	else
		System.out.println(num + " is not an Armstrong Number.");
	}*/
	
	
	
   
	//4 digit Number with while loop
	/*public static void main(String[] args) {
		int num=1634,originalNum,remainder,result=0;
		
		originalNum=num;
		while(originalNum !=0)
		{
			remainder =originalNum % 10;
			result+=Math.pow(remainder, 4);
			originalNum /=10;
		}
		if(result==num)
			System.out.println(num+ " is an Armstrong Number.");
		else
			System.out.println(num + " is not an Armstrong Number.");
	}*/
	
      
	//3 digit Number with for loop
	/*public static void main(String[] args) {
	 int num=371,originalNum,remainder,result=0,n=0;
	 originalNum=num;
	 
	 for(;originalNum !=0; originalNum/=10,++n);
		 originalNum =num;
	 
	 for(;originalNum !=0; originalNum/=10)
	 {
		 remainder=originalNum%10;
		 result+=Math.pow(remainder, n);
	 }
	 if(result==num)
		 System.out.println(num+" is an Armstrong Number.");
	 else
		 System.out.println(num+ " is not an Armstrong number.");
 }*/
	
	
	
	//4 digit Number with for loop
	public static void main(String[] args) {

		 int num=1634,originalNum,remainder,result=0,n=0;
		 
		 originalNum=num;
		 
		 for(;originalNum !=0; originalNum/=10, ++n);
		 
			 originalNum =num;
		 
		 for(;originalNum !=0; originalNum/=10)
		 {
			 remainder=originalNum%10;
			 result+=Math.pow(remainder, n);
		 }
		 if(result==num)
			 System.out.println(num+" is an Armstrong Number.");
		 else
			 System.out.println(num+ " is not an Armstrong number.");
    }
}
	
	

