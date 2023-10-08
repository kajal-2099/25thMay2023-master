package day18.predefinedclasses.scannerclass;

class Ref{
	void calling() {
		System.out.println("I am calling method of Ref class");
	}
}
public class Example1 {
	static Ref r1=new Ref();
	public static void main(String[] args) {
//		Ref r1=new Ref();
//		r1.calling();
		
		Example1.r1.calling();
	//classname.staticReferenceOfRef.nonstaticMethodOfRefClassname
		
		System.out.println("Hello");
	//classname.staticRefereanceOfPrintStreamClass.nonstaticMethodOfPrintStreamClass
		
		System.err.println("Bye");
		
		System.out.println("user home dir: "+System.getProperty("user.home"));
		System.out.println("current working dir: "+System.getProperty("user.dir"));
		System.out.println("current working dir: "+System.getProperty("user.name"));
		System.out.println("current working dir: "+System.getProperty("java.home"));
		System.out.println("current working dir: "+System.getProperty("os.name"));
		
		System.out.println("System time in nano: "+System.nanoTime());
		System.out.println("System time in millis: "+System.currentTimeMillis());
		
		System.clearProperty("user.home");
		System.out.println("updated1, user home dir: "+System.getProperty("user.home"));
		
		System.setProperty("user.home", "F:\\JavaWorkspace\\CoreJavaSessions");
		System.out.println("updated2, user home dir: "+System.getProperty("user.home"));
		
		System.exit(0);//after this program will be terminated and none of the statement will be executed
		System.out.println("Bye bye");
	}
}
