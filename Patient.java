/*
 * Class: CMSC203
 * Instructor: Grigoriy Grinberg
 * Description: This class obtains and stores the information of the 
 * patient such as their, name, address, phone number and emergency contact.
 * Due: 09/25/2023
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming
 * assignment independently. I have not copied the code
 * from a student or any source. I have not given my code
 * to any student. Print your Name here: Ema Gomez
 */ 

public class Patient {

	String firstName;
	String middleName;
	String lastName;
	
	String streetAddress ;
	String city;
	String state;
	String zipCode;
	
	String phoneNumber;
	
	String emergencyContact;
	String emergencyPhone;
	//declares and initializes all the variables in this class.
	
	public Patient() {
		this.firstName=" ";
		this.middleName=" ";
		this.lastName=" ";
		
		this.streetAddress=" " ;
		this.city=" ";
		this.state=" ";
		this.zipCode=" ";
		
		this.phoneNumber=" ";
		
		this.emergencyContact=" ";
		this.emergencyPhone=" ";
	}
	//initializes this. variables to eliminate confusion for attributes and parameters with the same name
	
	Patient(String firstName,String middleName,String lastName){
		
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
	}
	//initializes patient’s first, middle and last name to the given values
	
	Patient(String firstName,String middleName,String lastName,
			String streetAddress,String city, String state, String zipCode,
			String phoneNumber,
			String emergencyContact, String emergencyPhone){
		
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		
		this.streetAddress = streetAddress;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		
		this.phoneNumber = phoneNumber;
		
		this.emergencyContact = emergencyContact;
		this.emergencyPhone = emergencyPhone;
	}
	//initializes all attributes of the patient to the given values
	
	
	public void setfirstName(String fName) {
        this.firstName = fName;
    }
    public String getfirstName(){
        System.out.println(this.firstName);
        return this.firstName;
    }
	
    
    public void setmiddleName(String mName) {
        this.middleName = mName;
    }
    public String getmiddleName(){
        System.out.println(this.middleName);
        return this.middleName;
    }
    
    
    public void setlastName(String lName) {
        this.lastName = lName;
    }
    public String getlastName(){
        System.out.println(this.lastName);
        return this.lastName;
    }
    
    
    public void setstreetAddress(String sAddress) {
        this.streetAddress = sAddress;
    }
    public String getstreetAddress(){
        System.out.println(this.streetAddress);
        return this.streetAddress;
    }
	
    
    public void setcity(String ct) {
        this.city = ct;
    }
    public String getcity(){
        System.out.println(this.city);
        return this.city;
    }
    
    
    public void state(String st) {
        this.state = st;
    }
    public String getstate(){
        System.out.println(this.state);
        return this.state;
    }

    
    public void zipCode(String zC) {
        this.zipCode = zC;
    }
    public String getzipCode(){
        System.out.println(this.zipCode);
        return this.zipCode;
    }

    
    public void setphoneNumber(String pN) {
        this.phoneNumber = pN;
    }
    public String phoneNumber(){
        System.out.println(this.phoneNumber);
        return this.phoneNumber;
    }
    
    
    public void emergencyContact(String eC) {
        this.emergencyContact = eC;
    }
    public String emergencyContact(){
        System.out.println(this.emergencyContact);
        return this.emergencyContact;
    }

    
    public void emergencyPhone(String eP) {
        this.emergencyPhone = eP;
    }
    public String getemergencyPhone(){
        System.out.println(this.emergencyPhone);
        return this.emergencyPhone;
    }
    /*creates accessors and mutators for each attribute to assign a value to the variable 
    and return the value of the variable*/
    
    
    
    public String buildFullName() {
    	return this.firstName+" "+this.middleName+" "+this.lastName;
    }
    //method that return patient's full name
    
    public String buildAddress() {
    	return  this.streetAddress + " " + this.city + " " + this.state + " " + this.zipCode;
    }
    //method that return patient's address
    
    public String buildEmergencyContact() {
    	return this.emergencyContact+" "+this.emergencyPhone;
    }
    //method that return patient's emergency contact information
    
    
    
    public String toString() {
    	return  "Patient info:"+"\n"+"  Name: "+buildFullName()+"\n"+
    			"  Address: "+buildAddress()+
    			"\n"+"  Phone Number: "+phoneNumber+"\n"+"  Emergency Contact: "+buildEmergencyContact();
    }
	//toString method that returns all of patient's information
    
}
