package demopackage;

public class DuplicateArray {

	/*public static void main(String[] args) {
		
		int [] arr=new int [] {1,2,3,4,5,5,6,7,8,9,0,2};
		
		System.out.println("Duplicate element in givan arrray:");
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
			    System.out.println(arr[j]);
			}
		}
		
		
	}*/
	
	
	public static void main(String[] args) {
		String[] my_array = {"abc","def","ghi","abc","jkl","def"};
		
		for(int i=0; i<my_array.length-1;i++) 
		{
			for(int j=i+1; j<my_array.length; j++)
			{
				if( (my_array[i].equals( my_array[j])) && (i !=j))
				{
					System.out.println("Duplicate Element is  : "+ my_array[j]);
				}
			}
		}
	}
}
