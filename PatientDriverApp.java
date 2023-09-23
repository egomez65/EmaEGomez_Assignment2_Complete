/*
 * Class: CMSC203
 * Instructor: Grigoriy Grinberg
 * Description: This class uses the other two classes to create objects and display the patient's information, 
 * procedure details, and charges for the procedures.
 * Due: 09/25/2023
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming
 * assignment independently. I have not copied the code
 * from a student or any source. I have not given my code
 * to any student. Print your Name here: Ema Gomez
 */ 

public class PatientDriverApp {

	public static void main(String[] args) {
		Patient patient = new Patient("Sponge", "Bob", "Squarepants",
									  "124 Conch Street", "Bikini Bottom", "CA", "12345",
									  "(123)456-7890",
									  "Patrick Star", "(098)765-4321");
	//Creates patient object, inputs patient information
		
		displayPatient(patient);
	//Prints out patient information using toString method
		
		Procedure procedure1 = new Procedure("Braces", "09/15/2023", "Ema Gomez", 1000.00);
		displayProcedure(procedure1);
	    
		Procedure procedure2 = new Procedure("Hip surgery", "09/20/2023", "Zain Ashraf", 10000.00);
		displayProcedure(procedure2);
		
		Procedure procedure3 = new Procedure("CT Scan", "09/30/2023", "Snow Gomez", 0.00);
		displayProcedure(procedure3);
	//Creates procedure objects and prints procedure information using toString method
		
		calculateTotalCharges(procedure1, procedure2, procedure3);
	//Prints out the total charges of the procedures using the calculateTotalCharges method
		
		System.out.println("\nStudent Name: Ema Gomez");
		System.out.println("MC#: M21074277");
		System.out.println("Due Date: 09/15/2023");
	//Prints out my name, MC#, and due date

}
	public static void displayPatient(Patient obj) {
    	System.out.println (obj.toString());
    }
	
	public static void displayProcedure(Procedure obj) {
    	System.out.println (obj.toString());
    }
	
	public static void calculateTotalCharges(Procedure obj1, Procedure obj2, Procedure obj3) {
		double total=obj1.charges+obj2.charges+obj3.charges;
    	System.out.println ("\nTotal Charges: "+total);
    }
	
}
