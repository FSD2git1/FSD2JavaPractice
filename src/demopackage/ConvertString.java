package demopackage;
 //import java.util.Scanner;
public class ConvertString {
    static void reverse(char str[],int start ,int end)
    {
    	char temp;
    	while(start <= end)
    	{
    		temp=str[start];
    		str[start]=str[end];
    		str[end]=temp;
    		start++;
    		end--;
    	}
    }
    static char[] reverseWords(char[] s) 
    {
    	int start=0;
    	for(int end=0; end<s.length; end++) 
    	{
    		if(s[end]== ' ') {
    			reverse(s,start, end);
    			start=end + 1;
    		}
    	}
    	reverse(s,start,s.length-1);
    	
    	reverse(s,0,s.length-1);
    	return s;
    }
    
    
   public static void main(String[] args) {
	   
	 String s=" This is reverse each word in the string at same position  ";
	 
	 char[] p=reverseWords(s.toCharArray());
	 System.out.println(p);
}   
	   
	   /* String string
	  System.out.println("Enter a string: ");
	  Scanner scanner =new Scanner(System.in);
	  str=scanner.nextLine();
	  scanner.close();
	   String reversed=reverseString(str);
	   System.out.println("the reversed string is:" + reversed);
   }
   
   public static String reverseString(String s) 
   {
	   if(s.isEmpty())
		   return s;
	   return reverseString(s.substring(1))+s.charAt(0);*/

   
	   
	   
	   //Converting string in sequence char
	  /* String a="Java Program";
	   
	     
	   for (int i=0; i<a.length(); i++)
	   {
		   char b=a.charAt(i);
		   System.out.println("Char at "+i+" index is:"+b);
	   }*/
	   
	   
	   //Reverse string 
	   
	  /* String str="Ankita kharche", rstr="";
	   char ch;
	   System.out.println("Original word: "+ "Ankita kharche");
	   
	   for(int i=0; i<str.length(); i++)
	   {
		   ch=str.charAt(i);
		   rstr=ch+rstr;
	   }
	   System.out.println("Reversed word: " + rstr);*/
	   
	   
	   
	   

}
