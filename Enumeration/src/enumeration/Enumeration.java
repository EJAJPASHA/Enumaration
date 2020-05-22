package enumeration;
/*
 * 1.This concept is introduced in 1.5 version 
 * 2.enumeration is used to declare group of named constant s. 
 * 3.we are declaring the enum by using enum  keyword. For the enums the compiler will generate .classess 
 * 4.enum is a keyword and Enum is a class and every enum is directl child class of java.lang.Enum
 * so it is not possible to inherit the some other class.
 *   Hence for the enum inheritance concept is not applicable
 * 5. by default enum constants are public static final 
 */

public class Enumeration {
	enum MumbaiIndians {
		RS, QD, SY, HP, KP, PL, MG, BR, LM, MM, TB
	}
	//we can add constructor in enum.
	//but when we are adding constructor in enum we must use semicolon at the end of constants
	enum Heroin
	{ 
		samantha,tara,anu,ubanu;
		Heroin()
		{
			System.out.println("ratan sir"); 
			} 
		}
	//constructor with arguments in enum
	enum Hero 
	{ 
		ANUSHKA,KATRINA(10),DEEPIKA(10,20);
		Hero()
		{ 
			System.out.println("anushka on 2");
			} 
		Hero(int a)
		{
			System.out.println("katrina got first");
			} 
		Hero(int a,int b) 
		{ 
			System.out.println("deepika is last");
			}
		} 
	
	// inside the enums it is possible to declare group of constants and constructors and main method 
	enum Heroine  { 
		//group of constants
		/*
		 * . inside the enum it is possible to declare  constructors
		 * . That constructors will be ececuted for each and every constant.
		 *  If we are declaring 5 constants then 5 times constructor will be executed. 
		 */
		ANUSHKA,UBANU,DEEPIKA;  
		//contructor  
		Heroine()  
		{
			System.out.println("ratan"); 
			} 
		//enum  main method 
		public static void main(String[] args)
		{  
			System.out.println("enum m ain method"); 
			}//end main }//end enum 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MumbaiIndians mi = MumbaiIndians.RS;
		System.out.println(mi);// rs
		System.out.println("----------------------------------------------");
		/*
		 * 1. printing the enumeration constants by using for-each loop. 
		 * 2.values() methods are used to print all the enum constants. 
		 * 3.ordinal() is used to print the index values of the enum constants. 
		 */
		MumbaiIndians m[]=MumbaiIndians.values();
		for(MumbaiIndians md:m)
		{
			System.out.println(md+"----"+md.ordinal());
		}
		System.out.println("----------------------------------------------");

		Heroin h=Heroin.anu;
		//enum main method()
		Heroine[] hh = Heroine.values();  
		for (Heroine h1 : hh) 
		{ 
			System.out.println(h1+"----"+h1.ordinal()); 
			} 
		System.out.println("----------------------------------------------");

		//CONSTUCTOR WITH ARGUMENTS
		Hero[] hO = Hero.values();
		for (Hero h2 : hO) 
		{ 
			System.out.println(h2+"----"+h2.ordinal()); 
			}  

	}

}
