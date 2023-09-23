/*
 * Class: CMSC203
 * Instructor: Grigoriy Grinberg
 * Description: This class obtains and stores the 
 * information of the patient's procedures such as their procedure's 
 * name, procedure's date, practitioner, and charges for the services.
 * Due: 09/25/2023
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming
 * assignment independently. I have not copied the code
 * from a student or any source. I have not given my code
 * to any student. Print your Name here: Ema Gomez
 */ 

public class Procedure {
	
	String procedureName ;
	String procedureDate;
	String practitioner;
	double charges;
	//declares and initializes variables in this class
	
	public Procedure() {
		this.procedureName=" " ;
		this.procedureDate=" ";
		this.practitioner=" ";
		this.charges=0;
	}
	//initializes this. variables to eliminate confusion for attributes and parameters with the same name
	
Procedure(String procedureName,String procedureDate){
		this.procedureName = procedureName;
		this.procedureDate = procedureDate;
	}
	//initializes procedure’s name and date to the given values

Procedure(String procedureName,String procedureDate, String practitioner, double charges){
		this.procedureName = procedureName;
		this.procedureDate = procedureDate;
		this.practitioner = practitioner;
		this.charges = charges;
	}
	//initializes all attributes of the procedure to the given values


	public void setprocedureName(String pName) {
	    this.procedureName = pName;
	}
	public String getstreetAddress(){
	    System.out.println(this.procedureName);
	    return this.procedureName;
	}
	
	
	public void setprocedureDate(String pDate) {
	    this.procedureDate = pDate;
	}
	public String getcity(){
	    System.out.println(this.procedureDate);
	    return this.procedureDate;
	}
	
	
	public void setpractitioner(String pract) {
	    this.practitioner = pract;
	}
	public String getstate(){
	    System.out.println(this.practitioner);
	    return this.practitioner;
	}
	
	
	public void setcharges(double ch) {
	    this.charges = ch;
	}
	public double getcharges(){
	    System.out.println(this.charges);
	    return this.charges;
	}
	/*creates accessors and mutators for each attribute to assign a value to the variable 
    and return the value of the variable*/
	
    public String toString() {
    	return  "\n"+"\tProcedure: "+this.procedureName+
    			"\n"+"\tProcedure Date: "+this.procedureDate+
    			"\n"+"\tPractitioner: "+this.practitioner+
    			"\n"+"\tCharge: "+this.charges;
    }
    //toString method that returns all of patient's procedure information
    
}
