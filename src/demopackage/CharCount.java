package demopackage;

public class CharCount {
 
	public static void main(String[] args) {
		String string ="This is program";
		int count=0;
		
		for(int i = 0; i < string.length(); i++)
		{
			  if(string.charAt(i) != ' ')    
		 count++;
		}
		System.out.println("Total Num of Characters in a String:" +count);
	}

}
