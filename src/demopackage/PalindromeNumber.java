package demopackage;

public class PalindromeNumber {
public static void main(String[] args) {
	int x,sum=0,temp;
	int n=454;
	temp=n;
	while(n>0) {
		x=n%10;
		sum=(sum*10)+x;
		n=n/10;
		
	}
	if(temp==sum)
		System.out.println("Palindrome number");
	else
		System.out.println("Not palindrome number");
}
}
