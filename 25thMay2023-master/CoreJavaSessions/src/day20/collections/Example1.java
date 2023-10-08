package day20.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Example1 {
	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
				//or
		
		List l1=new ArrayList();
		l1.add("Pune");//Object e="Pune"; //Auto upcasting
		l1.add(123);//Autoboxing to get Integer class Object, dn Auto upcasting to convert it to Object class object
		l1.add(new String("Mumbai"));//Auto upcasting, from String class to Object class
		l1.add(new Example1());//Auto upcasting, from Example1 to Object class
		l1.add(123);//Autoboxing to get Integer class Object, dn Auto upcasting to convert it to Object class object
		l1.add(null);
		System.out.println("List elements are: "+l1);
		
		l1.add(2, "Java-Selenium");
		System.out.println("Add new element, List elements are: "+l1);
		
		l1.set(4, "Bangalore");
		System.out.println("Updated, List elements are: "+l1);
		
		System.out.println("List element count: "+l1.size());
		
		System.out.println("Element at index 3: "+l1.get(3));
		System.out.println("**************Printing List element using for loop********************");
		for(int i=0;i<l1.size();i++) {
			System.out.println("Element at index "+i+": "+l1.get(i));
		}
		System.out.println("**************Printing List element using for each loop********************");
		for(Object obj:l1) {
			System.out.println(obj);
		}
		System.out.println("***************************************************");
		List l2=new ArrayList();
		l2.add("Java");
		l2.add("Selenium");
		l2.add("Manual");
		System.out.println("List2 element are: "+l2);
		System.out.println("Is List2 empty? "+l2.isEmpty());
		System.out.println("List2 has Java or not? "+l2.contains("Java"));
		System.out.println("Index of Manual in List2: "+l2.indexOf("Manual"));
		System.out.println("******************************************************");
		System.out.println("List1 element are: "+l1);
		System.out.println("List2 element are: "+l2);
		
//		l1.addAll(l2);
//		System.out.println("After adding l2 in l1, l1 elements are- "+l1);
		
		l1.addAll(2,l2);
		System.out.println("After adding l2 in l1 at index 2, l1 elements are- "+l1);
		
		l1.removeAll(l2);
		System.out.println("After removing l2 from l1, l1 elements are: "+l1);
		
		System.out.println("removing element from index 1, l1 elements are: " +l1.remove(1));
		System.out.println("L1 after removing 123, l1: "+l1);
		
		System.out.println("removing element 'Java-Selenium', l1 elements are: " +l1.remove("Java-Selenium"));
		System.out.println("L1 after removing 'Java-Selenium', l1: "+l1);
		
		System.out.println("******************************************");
		List<String> s1=new ArrayList<String>();
		s1.add("Abc");
		s1.add("XYZ");
		s1.add("Pqr");
		s1.add("Xyz");
		System.out.println("S1 elements are: "+s1);
		s1.removeIf(obj -> obj.contains("xyz"));
		System.out.println("S1 elements are: "+s1);
		
		Collections.reverse(s1);
		System.out.println("S1 elements are: "+s1);
		
		Collections.sort(s1);
		System.out.println("sorted, S1 elements are: "+s1);
	
		
	}
}
/*
toString() is overrided,it will give you element stored inside the object
*/