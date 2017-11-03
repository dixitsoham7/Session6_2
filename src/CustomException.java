/*This program illustrates Exception Handling in Java
 *We are implementing user-defined exceptions here
 *Advantage of user-defined exception is we can have our own error message
 *Same has been illustrated below where we create NegativeAgeException Class which is responsible to display error*/

import java.util.Scanner;  

class NegativeAgeException extends Exception{          //user defined exception class has been extended from Exception
	
	private int age;                                   //private variable age
	
	public NegativeAgeException(int age)               //parameterized constructor to instantiate variable
	{
		this.age=age;                                  //variable is instantiated
	}
	
	public String toString() {						  //toString() method is overridden in user defined exception which displays exception
		return "Age cannot be"+" "+age+" (negative)"; //error message
	}
}


public class CustomException {                       //main class where we are going to use user-defined exception

	static int getAge()								//method getAge() of class which inputs the age entered by the user			
	{
		int age;   //variable to store age value
		Scanner sc = new Scanner(System.in);  //creating object of Scanner Class
		age=sc.nextInt();  //storing entered value
		return age;    //returning value entered by the user
	}
	
	public static void main(String[] args) throws Exception {     //main method throws Exception
		
		System.out.print("Enter AGE: " );  //message for getting input 
		int age;  //variable to check further condition
		age=getAge();  //calling method getAge()
		
		//value of age inputed by user is stored in age variable declare in main function which is further used to check condition
		
		if(age<0) {         //if age is negative
			throw new NegativeAgeException(age);   //exception is thrown to NegativeAgeException class which is defined above 
		}
		
		//error message gets printed as age is negative. The message which is to printed is defined in toString() method of NegativeAgeException class
		
		else {   //if age is positive
			System.out.println("Age entered is " + age);  //print the inputed age
		}

	} //end of main function

}  //end of CustomException
