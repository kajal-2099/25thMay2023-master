package day18.predefinedclasses.objectclass;

public class Example0{

	public static void main(String[] args) {
		Example0 e1=new Example0();
		System.out.println(e1);//java compiler will call toString() of object class to print the in String form
		System.out.println(e1.toString());
		System.out.println("Program Ends");
	
	}
}
/**
FQCN: day18.predefinedclasses.objectclass.Example0@jgjgt765767jhgj

Object:
	* predefined class belongs to java.lang package
	* java.lang package by default available in each class so no need to write explicitly
	* also known as parent most class or super most class in java
	* every java class directly or indirectly inherits this class
	* Object is have some useful methods like
	* toString(), hashCode(), equals(), clone...
toString() gives string representation of an object in the form of 
			fullyQualifiedClassName@hexadecimalAddress
			packagename.classname@hexadecimalAddress
*/