package Minor_Project;

public class Teacher {
	private int id;
	private String Name;
	private double salary;
	private String Course;
	private int age;
	private String Gender;
	public Teacher() {
		
	}
	public String toString() {
		return "Teacher [id=" + id + ", Name=" + Name + ", salary=" + salary + ", Course=" + Course + ", age=" + age
				+ ", Gender=" + Gender + "]";
	}
	public Teacher(int id, String name, double salary, String course, int age, String gender) {
		super();
		this.id = id;
		Name = name;
		this.salary = salary;
		Course = course;
		this.age = age;
		Gender = gender;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getCourse() {
		return Course;
	}
	public void setCourse(String course) {
		Course = course;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	
	
}
