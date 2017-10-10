package Methodoverloading;
//package : Package is name that organizes a set of related classes and interfaces similar to 
///here I have created a package as Methodoverloading
public class SalesDemo {
	//public : members which can access as public,public members are visible to all other classes.
	//class : is a context of java that are used to create objects and to define object data types and methods.
	//classes are the basics of opps(object oriented programming)
//created class as salesDemo
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Public is a keyword that is used as an access modifier for methods and variables.
				//static used to prepare a field,method or inner classes as a class field.
				//void: it is void if the method does not return a value.
				//main:it is a function name When a program starts running, it has to start execution from somewhere.
				//String[] args: it is  defining a String array to pass arguments at command line. args is the variable name of the String array.
		 Sales Sales1 =new Sales(1);//here we are instantiating three object of sales class
	     //taking new sales1 value
	     Sales Sales2 =new Sales(133);//taking new sales2 value
	     Sales Sales3 =new Sales(1344, 7500.00);//taking new sales3 value
	                                           //displays above three values
	     
	            Sales1.display(); //displays object of class
	            //displays sales1 value    
	            Sales2.display();//displays sales2 value 
	            Sales3.display();//displays sales3 value 
	 
	}

}
