package newPackage;
//import java.util.Scanner;
public class DemoClass {
	 
	
   public static void main(String[] args) {
	   
   /*String str1="Ankita";
   String str2="";
   char chr;
   for(int i=str1.length()-1;i>=0;i++)
   {
	   chr=str1.charAt(i);
	   str2=str2+chr;
   }
   System.out.println(str1);
   System.out.println(str2);*/
   
   
	/* int a[]=new int [5];
	 
	 Scanner sc =new Scanner(System.in);
	 for(int i=0;i<a.length; i++)
	 {
		 System.out.println("Enter the element of array at a index " + i);
	    a[i] = sc.nextInt();
	 }
	 
	 
	 System.out.println(a[0]);
	 System.out.println(a[2]);*/
	   
	   String s1="BSFSD";
	   String s2="BSFSD";
	   
	   String t1= new String ("BSFSD");
	   String t2=new String ("BSFSD");
	   
	   //1. equal equal(==)
	   System.out.println(s1==s2);
	   System.out.println(t1==t2);
	   System.out.println(s1==t1);
	   System.out.println("==============");
	   
	   
	   //2.Equals
	   System.out.println(s1.equals(s2));
	   System.out.println(t1.equals(t2));
	   System.out.println(s1.equals(t2));
	   System.out.println("==============");
	   
	   //3.EqualsIgnoreCase
	   String a="BSFSD";
	   String b="Bsfds";
	   System.out.println(a==b);
	   System.out.println(a.equalsIgnoreCase(b));
	   System.out.println("==============");
	   
	   //4. Trim
	   String a1="BSFSD";
	   String b1="Bsfds";
	   
	   System.out.println(b1);
	   String b2=b1.trim();
	   System.out.println(b1.trim());
	   System.out.println(b2);
	   
	   System.out.println(a1.equalsIgnoreCase(b2));
	   System.out.println("==============");
	   
	   //5.toUpperCase
	   String x="Bsfsd";
	   System.out.println(x.toUpperCase());
	   
	   
	   //6.toLowerCase
	   
	   String a2=a1.toLowerCase();
	   System.out.println(a2);
	   System.out.println("==============");
	   
	   
	   //7.length()
	   int n = x.length();
	   System.out.println(n);
	   System.out.println(x.length());
	   System.out.println(b1.length());
	   System.out.println("==============");
	   //8. toCharArray
	   char ch[]= x.toCharArray();
	    for(int i=0; i<x.length(); i++) 
	    {
		     System.out.println(ch[i]); //only one single character shows
	          System.out.println(x.toCharArray());   //All sentence display
	    }
	    System.out.println("==============");
	    
	    
	    //9.charAt(index)
	    char c= x.charAt(2);
	     System.out.println(c);
	     
	     
	     for(int i = 0;  i < x.length();  i++)
	     {
	    	 System.out.println(x.charAt(i));
	     }
	     
	     System.out.println();
	     String x2="Bsfsd";
	     
	     for(int i = (x.length()-1); i >= 0; i--)
	     {
	    	 System.out.println(x.charAt(i));
	     }
	     
	     System.out.println("=============="); 
	    
	     //10. concat()
       int y=10;
       String q="Which is the integer";
       System.out.println("This the number: "+ y+  q);
       
       
       String str="Student Name:";
       System.out.println(str+ " Shubham");
       String newstr= str+ "shubham";
       System.out.println(newstr);
       
       //System.out.println(str.concat(" Rohit");
       String st=str.concat("Rohit");
       String st2="Rohit"+str;
       System.out.println(st);
       
       System.out.println("=============="); 
	    
       //11. indexOf()
       String m="This the number: 10 Which is the integer";
       int indx=m.indexOf('w');
       System.out.println(indx);
       int newindx=m.indexOf('t');
       
       System.out.println(newindx);
       
       System.out.println("=============="); 
	    
       //12.lastIndexOf()
       int lastindx=m.lastIndexOf('t');
       System.out.println(lastindx);
       
       int lid=m.lastIndexOf("the");
       System.out.println(lid);
       
       System.out.println("=============="); 
	    
       
       //13. startWith()
       boolean result=m.startsWith("This is");
       System.out.println(result);
       
       System.out.println("=============="); 
	    
       //14. endsWith()
       boolean result2=m.startsWith("integer");
       System.out.println(result2);
       
       System.out.println("=============="); 
	    
       
       //15. subString()
       String t="student Name:Ram patil";
       
       System.out.println(t.indexOf('R'));
       System.out.println(t.length());
       
       String tNew = t.substring(15);
       System.out.println(tNew);
       
       System.out.println("=============="); 
	    
		//regex=regular expression [a-z][A-Z][0-9][]@&$#] firstly check	regular expression   
	   
       //16.replace()
			   String t5=t.replace("Ram","Sham");
			   System.out.println(t5);
			   
			   String t6=t.replace('e','z');
			   System.out.println(t6);
			   
			   String t7=t.replace("e","z");
			   System.out.println(t7);
			   
			   String t8=t.replaceAll("e","z");
			   System.out.println(t8);
			   
			   String z="Ram Patil 1234";
			   
			   String z1=z.replace("[0-9]", "");
			   System.out.println(z1);
	   
	   
    }
}
