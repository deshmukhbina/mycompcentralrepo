package sorting;

import java.security.PrivateKey;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class TestEmpImplementComparable {

	public static void main(String[] args) {
		Employee e1=new Employee("ashu",101,25,25000);
		Employee e2=new Employee("raj",110,20,15000);
		Employee e3=new Employee("veer",102,25,25000);
		
		List ls=new ArrayList<Employee>();
		ls.add(e1);
		ls.add(e2);
		ls.add(e3);
		System.out.println("before sort:"+ls);
		/*Iterator<Object> itr = ls.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}*/
		
		System.out.println("after sort");
		Collections.sort(ls);
		System.out.println(ls);
		/*Iterator<Object> itr1 = ls.iterator();
		while (itr1.hasNext()) {
			System.out.println(itr1.next());
		}*/
		
	}

}
