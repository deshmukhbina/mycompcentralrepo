package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestImplementComparator {

	public static void main(String[] args) {
		Student e1=new Student("ashu",101,25);
		Student e2=new Student("raj",110,20);
		Student e3=new Student("veer",102,25);
		
		List ls=new ArrayList<Student>();
		ls.add(e1);
		ls.add(e2);
		ls.add(e3);
		System.out.println("before sort:"+ls);
		Iterator<Object> itr = ls.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("after sort");
		Collections.sort(ls,new AgeComparator());
		System.out.println(ls);
	}

}
