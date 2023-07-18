package demopackage;

public class Array_Pract {

	//Array  ---Non primitive 
	//Array is the data structure
	//Array is homogeneous in nature .
	
	/*syntax
	
	DataType VariableName[] = {element1, element2,element3,.....};
	DataType [] VariableName = {element1,element2,element3,.....};  */
	
	public static void main(String[] args) {
	int [] a= {1,2,3,4,5};
	String name[] = {"Ram", "Rahul","Kiran"};
	boolean logic[] = {true,false,true,false};
	
	System.out.println(a[2]);  //feching the specific element
	
	a[2]=10;   //ArrayName(index)=Updated value;      -
	System.out.println(a[2]);
	}
}