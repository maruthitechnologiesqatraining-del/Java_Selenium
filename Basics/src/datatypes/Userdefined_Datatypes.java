package datatypes;

public class Userdefined_Datatypes {
	//Instance variables
	int b=15;
	public String s="Java";
	int num = 10;  
	public int dog(String name) {
		//local variables
		int a=10;
		System.out.println("Dog name:"+name);
		System.out.println("Instance value :"+s);
		System.out.println("Value A:"+a);
		System.out.println("Value B:"+b);
		return a;
	}
	
	public void printNum(){ 
		System.out.println("Value B:"+b);
		System.out.println(" Variable: " + num);  
	}

	
	public static void main(String[] args) {
		int a=12;
		Userdefined_Datatypes datatype = new Userdefined_Datatypes();
		datatype.dog("ChinkiMinky");
		System.out.println("Value A:"+a);
		datatype.printNum();
		//System.out.print("Value B:"+b);
		
	}

}
