package Other;

public class Student {

	String name;
	String lastName;
	int age;
	int year;

	public Student(String name, String lastName, int age, int year) {

		this.age = age;
		this.name = name;
		this.lastName = lastName;
		this.year = year;
	}

	public Student() {

	}

	public int getAgeStudent() {
		return age;
	}

	public int getYearStudent() {
		return year;
	}

}
