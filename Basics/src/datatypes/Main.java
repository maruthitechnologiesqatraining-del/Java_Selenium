package datatypes;

import java.util.Collections;
public class Main{  
	   public static void main(String args[]){  
	       Student s1 = new Student();  
	       Student s2 = new Student();  
	       String  a= null;
	       s1.age = 24;  
	       s2.age = 21;  
	       Student.age = 23;
	       Student.b=20;
	       System.out.println("S1\'s age is: " +  Student.age);  
	       System.out.println("S2\'s age is: " + Student.age); 
	       System.out.println("S2\'s age is: " + Student.b);
	   }  
	}  