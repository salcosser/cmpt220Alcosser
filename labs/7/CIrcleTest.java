//Sam Alcosser
//3-4-19
public class CIrcleTest {
//Write a test program that creates a Circle object c1 (new Circle(2, 2, 5.5)), displays its
//	area and perimeter, and displays the result of c1.contains(3, 3), c1.contains(new
//			Circle(4, 5, 10.5)), and c1.overlaps(new Circle(3, 5, 2.3)).

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//making the base circle
		Circle c1= new Circle(2,2,5.5);
		System.out.println("The area of c1 is: " + c1.getArea() + " and the perimeter is: " + c1.getPerimeter()); //giving data
		System.out.println("Does c1 contain the point (3,3)? :" + c1.contains(3, 3)); //if c1 contains this point
		Circle c2 = new Circle(4,5,10.5); // making a second circle
		System.out.println("Does c1 contain a circle with a center point of (4,5), and a radius of 10.5? : " + c1.contains(c2));	//telling if c1 contains c2
		Circle c3 = new Circle(3,5,2.3); //making the third circle
		System.out.println("Does c1 overlap with a circle that has a center point of (4,5), and a radius of 2.3?: "+ c1.overlap(c3)); //testing overlap
	}

}
