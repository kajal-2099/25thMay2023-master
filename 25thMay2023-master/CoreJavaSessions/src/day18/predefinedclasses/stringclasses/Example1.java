package day18.predefinedclasses.stringclasses;
/**
 * Immutable Class: its value can't be changed, if you change new object will be created
 * 1. class and data variable should be declared as final
 * 2. constructor should be parameterized, to initialize final data variable
 * 3. use only getter method to get final variables value
 */

final class MyImmutableClass{
	final String name;
	final int empId;
	public MyImmutableClass(String name,int empId) {
		this.name=name;
		this.empId=empId;
	}
	public String getName() {
		return name;
	}
	public int getEmpId() {
		return empId;
	}
}
public class Example1 {

	public static void main(String[] args) {
		MyImmutableClass m1=new MyImmutableClass("Pune", 123);
		System.out.println(m1.getName());
		System.out.println(m1.getEmpId());
		//m1.empId=201; //final variable value can't be modified
		//m1.name="Abc";//final variable value can't be modified
	
		MyImmutableClass m2=new MyImmutableClass("Abc", 201);
		System.out.println(m2.getName());
		System.out.println(m2.getEmpId());
	}

}
