import java.util.Calendar;
import java.util.GregorianCalendar;

public class Person {
	private String name;
	private double height;
	private int birthYear;
	
	// Constructor Method
	public Person (String name, int birthYear, double height) {
		this.name = name; 
		this.height = height;
		this.birthYear = birthYear;
	}

	//GET's Methods
	public String getName() {
	     return this.name;
	}
	
	public int getBirthYear() {
		return this.birthYear;
	}
	
	public double getHeight() {
	    return this.height;
	}
	
	//SET's Methods
	public void setName(String name) {
	     this.name = name;
	}
	
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	
	public void setHeight(double height) {
	     this.height = height;
	}
	
	//Age Calculator
	public int calcAge() {
		Calendar cal = GregorianCalendar.getInstance();
		return  (cal.get(Calendar.YEAR) - this.birthYear); 
	}
	     
		public void introduceAttributes() {	
		System.out.printf("%nNome: %s%n", this.name);
		System.out.printf("Altura: %.2fm %n", this.height);
		System.out.println("Ano de nascimento: " + this.birthYear);
		System.out.println("Idade: " + calcAge() + " anos");
	}
}