
public class sqaureTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square s1 = new Square(40); //creating square 1
		Square s2 = new Square(39.5); //creating square 2
		//printing and formatting the values for square 1
		System.out.println("Square 1");
		System.out.println("--------");
		System.out.println("Width: " + s1.width);
		System.out.println("Area: "+ s1.getArea());
		System.out.println("Perimeter: " + s1.getPerimeter());
		System.out.println("");
		//printing and formatting the values for square 2
		System.out.println("Square 2");
		System.out.println("------------");
		System.out.println("Width: " + s2.width);
		System.out.println("Area: "+ s2.getArea());
		System.out.println("Perimeter: " + s2.getPerimeter());
		System.out.println("------------");
	}

}
