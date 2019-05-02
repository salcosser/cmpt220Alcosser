//Sam Alcosser
//5-1-19
public abstract class Employee {
 String name;
 double age;
 double hourRate;
 public abstract double salary(double hours); //leaving space for this method to be used
 //constructor
 public Employee(String name, int age, int hourRate) {
	 this.name = name;
	 this.age = age;
	 this.hourRate = hourRate;
 }
 public String toString() {
 return "name= " + name + " age=" + age + " hourRate="
 + hourRate;
 }
}
