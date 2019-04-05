import java.util.Arrays;
//Sam Alcosser
//3-4-19
public class Course {
	private String courseName;
	private String[] students = new String[5];
	private int numberOfStudents;
	public Course(String courseName) {
		this.courseName = courseName;
	}
	// method to add a student
	public void addStudent(String student) {
		students[numberOfStudents] = student;
		numberOfStudents++;
		if(numberOfStudents == students.length) {		// handling if the next student would go over capacity
			String[] temp = new String[students.length+5]; //creating a holder array
			for(int i = 0; i<students.length;i++) {
				temp[i] = students[i];		//setting up the new array
			}
			students = temp;		//changing over to the new array
		}
		
	}

	public String getCourseName() {
		return courseName;
	}

	public String[] getStudents() {
		return students;
	}

	public int getNumberOfStudents() {
		return numberOfStudents;
	}
	
	public void dropStudent(String student) {
		for (int i = 0; i < numberOfStudents; i++) {
			if (students[i].equals(student)) {
				for (int j=i+1; j < numberOfStudents; j++) {
					students[j - 1] = students[j];
					students[j] = null; //added in this line as without it there would be duplicates
				}
				numberOfStudents--;
				return;
			}
		}
	}
	//simple method to reset the list if needed
	public void clear() {
		String[] empty = new String[5];
		students = empty;
	}
}