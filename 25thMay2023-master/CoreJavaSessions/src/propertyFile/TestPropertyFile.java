package propertyFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
public class TestPropertyFile {

	public static void main(String[] args) throws IOException {
		// Step1: create instance of FileInputStream class and pass the location of your property file in its constructor
		String currentDir=System.getProperty("user.dir");
		FileInputStream fis1=new FileInputStream(currentDir+"\\PropertyFiles\\AppData.properties");
							//or
		FileInputStream fis2=new FileInputStream("F:\\JavaWorkspace\\CoreJavaSessions\\PropertyFiles\\AppData.properties");
							//OR
		FileInputStream fis3=new FileInputStream(".\\PropertyFiles\\AppData.properties");
		//Step2: create an instance of Properties class
		Properties prop=new Properties();
		//Step3: using Properties class reference variable call load() and pass FileInputStream object reference as parameter
		prop.load(fis3);
		//Step4: using Properties class reference call getProperty(key) and pass the required key for which you need value from property file
		String url=prop.getProperty("applicationUrl");
		System.out.println("Application url is: "+url);
				//or
		System.out.println("usenname is: "+prop.getProperty("username"));
		System.out.println("phoneNumber is: "+prop.getProperty("phoneNumber"));
	}

}
