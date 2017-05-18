package sorting;

import java.util.Comparator;

public class AgeComparator       implements Comparator<Student> {

	public int compare(Student o1, Student o2) {
		System.out.println("  ");
		return o1.getAge()-o2.getAge();
	}
    
}
