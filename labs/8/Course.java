//Sam Alcosser
//4-17-19

//simple course class to keep track of the students in  a course
import java.util.ArrayList;

public class Course {
  private String courseName;
  private ArrayList<String> students = new ArrayList<>();
  private int numberOfStudents;
  //arg constructor
  public Course(String courseName) {
    this.courseName = courseName;
  }
  //setters and getters for the different attributes
  public void addStudent(String student) {
    students.add(student);
  }
  
  public String[] getStudents() {
    return (String[]) students.toArray();
  }

  public int getNumberOfStudents() {
    return students.size();
  }  

  public String getCourseName() {
    return courseName;
  }  
  
  public void dropStudent(String student) {
    students.remove(student);
  }

	}

