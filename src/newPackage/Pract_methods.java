package newPackage;

public class Pract_methods {
        
	//Method
	
	public static void main(String[] args) {
		String str1="Ankita";
		   String str2="";
		   char chr;
		   for(int i=str1.length()-1;i>=0;i++)
		   {
			   chr=str1.charAt(i);
			   str2=str2+chr;
		   }
		   System.out.println(str1);
		   System.out.println(str2);
	}
}
