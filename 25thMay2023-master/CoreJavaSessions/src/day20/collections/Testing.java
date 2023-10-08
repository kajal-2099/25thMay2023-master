package day20.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Testing {

	public static void main(String[] args) {
		List l1=new ArrayList();
		l1.add(10);
		l1.add(20);
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(10);
		System.out.println("List "+l1);
		Set s1=new HashSet(l1);
		System.out.println("set: "+s1);
		Iterator itr=s1.iterator();
		for(int i=0;i<s1.size();i++) {
			int num=(int) itr.next();
			System.out.print("Number :"+num);
			System.out.println(" Frequency is "+Collections.frequency(l1, num));
		}
	}

}
