package day18.predefinedclasses.stringclasses;

public class SingleObject {
	/**
	 * 1. constructor should be private
	 * 2. create static private ref variable of the class
	 * 3. create static method which return current class object
	 */
	String name="Pune";
	private SingleObject() {
		System.out.println("I am singleton class constructor...");
	}
	
	private static SingleObject s1=new SingleObject();
	
	public static SingleObject getInstanceOfSingleObject() {
		return s1;
	}
	
	void calling() {
		System.out.println("I am calling() of SingleObject class");
	}
}
class Demo{	
	public static void main(String[] args) {
		
		//SingleObject s1=new SingleObject();
		
		SingleObject s1=SingleObject.getInstanceOfSingleObject();
		System.out.println(s1.name);
		s1.calling();
		s1.name="Mumbai";
		System.out.println(s1.name);
		
		SingleObject s2=SingleObject.getInstanceOfSingleObject();
		System.out.println("using s2 ref, name: "+s2.name);
	}
}
