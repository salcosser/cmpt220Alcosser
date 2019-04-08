//Sam Alcosser
//4-4-19
//. Write a test program that creates a course, adds three students, removes one, and
//displays the students in the course.
public class CourseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//defining the new course
		Course math = new Course("Math");					
		math.addStudent("John Smith");	//adding three students
		math.addStudent("Jane Doe");
		math.addStudent("Lorem j Ipsum");
		math.dropStudent("Jane Doe"); //removing Jane
		for(String name: math.getStudents()) {	//simple for loop printing out the names
			System.out.println(name);
		}
	}

}
