package sorting;

public class Student           {
	private String  studname;
    private int studid;
    private int age;
    
    public Student(String studname, int studid, int age) {
		this.studname=studname;
		this.studid=studid;
		this.age=age;
	}
    
	public String getStudname() {
		return studname;
	}
	public void setStudname(String studname) {
		this.studname = studname;
	}
	public int getStudid() {
		return studid;
	}
	public void setStudid(int studid) {
		this.studid = studid;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [studname=" + studname + ", studid=" + studid
				+ ", age=" + age + "]";
	}
	

}
