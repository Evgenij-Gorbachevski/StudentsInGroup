package Other;

import Other.Student;

public class Group {

	private Student[] students;
	int yearOfFoundation;
	int countOfStudents;
	int avgStudentAge;

	public int FoundationYear() {
		return yearOfFoundation;
	}

	public int countStudentsInGroup() {
		return countOfStudents;
	}

	private void addOneStudent(Student student) {
		students[countOfStudents] = student;
		countOfStudents++;
	}

	public void addStudent(Student student) {
		if (students != null) {
			if (countOfStudents < students.length) {
				addOneStudent(student);
			} else {
				makeNewArray();
				addOneStudent(student);
			}
		} else {
			students = new Student[10];
			addOneStudent(student);

		}
	}

	private void makeNewArray() {
		Student[] students = new Student[countOfStudents + 10];
		for (int i = 0; i < this.students.length; i++) {
			students[i] = this.students[i];
		}
		this.students = students;
	}

	// средний возраст
	public int avgAgeStudent() {
		int sum = 0;
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null) {
				int b = students[i].getAgeStudent();
				sum = sum + b;
			}
		}
		sum = sum / countOfStudents;
		return sum;
	}

	// год поступления
	public int yearOfAdmission() {
		int sum = 2015;
		int sum2 = 0;
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null) {
				int b = students[i].getYearStudent();
				if (b == sum) {
					sum2++;
				}
			}
		}
		return sum2;
	}

	public int maxYear() {
		int chislo = 0;
		int year = 0;

		for (int i = 0; i < students.length; i++) {
			if (students[i] != null) {
				if (chislo == 0) {
					year = students[i].getYearStudent();
					chislo++;
				}
				if (year == students[i].getYearStudent()) {
					chislo++;
				} else
					chislo--;
			}
		}

		return chislo > 0 ? year : null;

		// if (chislo > 0){
		// return year;} else ruturn null;

	}

	// отсортировать студентов группы по возрасту (по возрастанию / убыванию на
	// выбор)
	// метод пузырькa

	public void boobleSort() {
			for (int i=0; i<students.length - 1; i++) {
				for (int j=i+1; j<students.length; j++) {
					if(students[i].getAgeStudent() > students[j].getAgeStudent()) {
						Student tmp = students[i];
						students[i]=students[j];
						students[j] = tmp;
					}
				}
				System.out.println(students[i].name +"     "+students[i].age);
			}
				
		}
	
	// метод вставаки

	public void insertSort() {
		int t;
		int i,j;
		for(i=0;i<students.length; i++) {
			t = students[i].getAgeStudent();
			for(j=i-1; j>=0 && students.length>t;j--) { 
				students[j+1]=students[j];
				}
				students[j+1] = t;
			
		}
	}
	
	//метод выбора
	
	
	
	//метод быстрой сортировки
	
}
