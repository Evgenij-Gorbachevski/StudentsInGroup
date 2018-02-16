package Main;

import Other.Student;
import Other.Group;

public class Main {

	public static void main(String[] args) {

		Group arg = new Group();

		Student student1 = new Student("Jan", "Jankowski", 20, 2016);
		Student student2 = new Student("Karl", "Karlowski", 21, 2016);
		Student student3 = new Student("Jack", "Majski", 18, 2015);
		Student student4 = new Student("Tom", "Bykow", 26, 2015);
		Student student5 = new Student("Alex", "Nowak", 51, 2016);

		Student student6 = new Student("Jan", "Jankowski", 20, 2011);
		Student student7 = new Student("Karl", "Karlowski", 22, 2015);
		Student student8 = new Student("Jack", "Majski", 14, 2015);
		Student student9 = new Student("Tom", "Bykow", 26, 2015);
		Student student10 = new Student("Alex", "Nowak", 45, 2016);
		
		Student student11 = new Student("Jan", "Jankowski", 30, 2012);
		Student student12 = new Student("Karl", "Karlowski", 33, 2012);
		Student student13 = new Student("Jack", "Majski", 25, 2011);
		Student student14 = new Student("Tom", "Bykow", 26, 2015);
		Student student15 = new Student("Alex", "Nowak", 19, 2016);
		
		Student student16 = new Student("Jan", "Jankowski", 24, 2015);
		Student student17 = new Student("Karl", "Karlowski", 24, 2016);
		Student student18 = new Student("Jack", "Majski", 26, 2013);
		Student student19 = new Student("Tom", "Bykow", 26, 2012);
		Student student20 = new Student("Alex", "Nowak", 31, 2017);
		
		arg.addStudent(student1);
		arg.addStudent(student2);
		arg.addStudent(student3);
		arg.addStudent(student4);
		arg.addStudent(student5);
		
		arg.addStudent(student6);
		arg.addStudent(student7);
		arg.addStudent(student8);
		arg.addStudent(student9);
		arg.addStudent(student10);
		
		arg.addStudent(student11);
		arg.addStudent(student12);
		arg.addStudent(student13);
		arg.addStudent(student14);
		arg.addStudent(student15);
		
		arg.addStudent(student16);
		arg.addStudent(student17);
		arg.addStudent(student18);
		arg.addStudent(student19);
		arg.addStudent(student20);
		
		
		
		System.out.println();
		System.out.println("Colichestwo chelowek w gruppe: " + arg.countStudentsInGroup()+" chelowek(a)");
		System.out.println();
		System.out.println("Srednij vozrast: " + arg.avgAgeStudent()+" let");
		System.out.println();
		System.out.println("V 2015 gody bilo zachisleno: " + arg.yearOfAdmission()+" chelowek(a)");
		System.out.println();
		System.out.println("Samoe bolshoe postuplenie bilo w:" + arg.maxYear()+ " gody");
		System.out.println();
		System.out.println("___Puzyriek________");
		System.out.println();
		arg.boobleSort();
		
	}

}
