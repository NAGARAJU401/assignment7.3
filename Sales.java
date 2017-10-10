package Methodoverloading;
//package : Package is name that organizes a set of related classes and interfaces similar to 
///here I have created a package as Methodoverloading
public class Sales {
	//public : members which can access as public,public members are visible to all other classes.
			//class : is a context of java that are used to create objects and to define object data types and methods.
			//classes are the basics of opps(object oriented programming)
	//created class as sales
	private int SalesID ;//private is a keyword which declares member is only visible
    //intilaizing SalesID
private double SalesAmt;//taking Sales Amt by using double keyword

public Sales() {////Here public is a access modifier which defines who can access this method
SalesID =0;//taking salesid value as 0
SalesAmt=0;//taking salesAmt value as 0
}
public Sales (int sID){
	this.SalesID =sID;//taking sID
}	
public Sales (int sID ,double sAmt){
this. SalesID =sID;//salesId equal to sID
this.SalesAmt=sAmt;//salesAmt equal to sAmt
}	

public void display(){
	//Public is a keyword that is used as an access modifier for methods and variables.
	//void: it is void if the method does not return a value.
	
System.out.println("sales ID:" +SalesID); //system is used to return code
//system : is a class in java language pacakge.
		//out : static member of the system class.
		//println : to print what is output.

System.out.println("sales Amt:" +SalesAmt); 
//system : is a class in java language pacakge.
		//out : static member of the system class.
		//println : to print what is output.

	}

}
