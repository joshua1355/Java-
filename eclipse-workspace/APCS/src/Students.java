import java.util.ArrayList;
import java.util.List;

public class Students {

	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public int getGrade() {
		return grade;
	}


	public void setGrade(int grade) {
		this.grade = grade;
	}


	public static List<Students> getSchool() {
		return school;
	}


	

	private String name;
	private int age;
	private int grade;
	private static List<Students> school = new ArrayList<>();
	
	
	public Students(String name, int age, int grade) {
		this.name = name;
		this.age = age;
		this.grade = grade;
		school.add(this);
	}
	
	
	
}


