package demopackage;

import java.util.Scanner;

public class EvenOddNo {
	
	public static void main(String[] args) {
		Scanner reader=new Scanner (System.in);
		
		System.out.print("Enter a number:");
		//int num=reader.nextInt();
		
		//if(num %2==0)
		
			//System.out.println(num + " is Even Number");
		//else
			//System.out.println(num + " is Odd Number");
			
		
	
	
	int a;
	a=reader.nextInt();
	if(a%2==0)
		System.out.println("The given number is Even No.");
		else
			System.out.println("The given Number is odd No.");
	}
}
