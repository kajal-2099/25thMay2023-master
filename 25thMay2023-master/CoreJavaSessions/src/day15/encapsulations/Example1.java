package day15.encapsulations;

class Encap {
	private int pinCode = 4110;
	private double salary = 45000;
	private char grade = 'A';
	/**
	 * getter: this method will help to access private variable from outside the class
	 * 		   create method with following-	
	 * 				* access modifier: public
	 * 				* return type: same as your variable datatype and return private variable
	 * 				* argument: NA
	 */
	public int getPinCode() {
		return pinCode;
	}
	public double getSalary() {
		return salary;
	}
	public char getGrade() {
		return grade;
	}
	
	/**
	 * setter: this method will help to modify private variable from outside the class
	 * 		   create method with following-	
	 * 				* access modifier: public
	 * 				* return type: void
	 * 				* argument: same as your variable datatype and assign local variable value to global variable
	 */
	public void setPinCode(int pin) {
		pinCode=pin;
	}
	public void setSalary(double salary) {
		this.salary=salary;
	}
	public void setGrade(char grade) {
		this.grade=grade;
	}
}

public class Example1 {

	public static void main(String[] args) {
		Encap e1 = new Encap();
//		System.out.println(e1.pinCode);
//		System.out.println(e1.salary);
//		System.out.println(e1.grade);
		
		System.out.println("PinCode is : "+e1.getPinCode());
		System.out.println("Salary is: "+e1.getSalary());
		System.out.println("Grade is: "+e1.getGrade());
		
		//e1.salary=50000;
		e1.setGrade('B');
		e1.setPinCode(5001);
		e1.setSalary(50000);
		System.out.println("updated, PinCode is : "+e1.getPinCode());
		System.out.println("updated, Salary is: "+e1.getSalary());
		System.out.println("updated, Grade is: "+e1.getGrade());		
	}
}
