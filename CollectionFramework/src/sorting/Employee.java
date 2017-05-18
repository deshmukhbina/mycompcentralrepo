package sorting;

import java.util.Comparator;

public class Employee implements Comparable<Employee>{
	private String  empName;
    private int empId;
    private int age;
    private long salary;
    
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String empName, int empId, int age, long salary) {
		this.empName=empName;
		this.empId=empId;
		this.age=age;
		this.salary=salary;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	
	
    
	public String toString() {
		return "Employee [empName=" + empName + ", empId=" + empId + ", age="
				+ age + ", salary=" + salary + "]";
	}
	public int compareTo(Employee o) {
		return (this.empId-o.empId);
	}
	
	
	
	
}
