import java.util.Scanner;

//Sam Alcosser
//4/17/19

public class TriangleTest {
	//changing to account for illegal triangles
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		//getting the lengths of the sides of the triangle
		Scanner input = new Scanner(System.in);
		System.out.println("please input the lengths of the three sides of the triangle");
		double s1 = input.nextDouble();
		double s2 = input.nextDouble();
		double s3 = input.nextDouble();
		if(((s1 + s2) <= s3) || ((s2 + s3) <= s1) || ((s1  + s3) <= s2)) {
			throw new IllegalTriangleException();
		}
		//making the triangle
		Triangle t=  new Triangle(s1,s2,s3);
		//getting the color of the triangle
		System.out.print("what color?");
		String color = input.next();
		t.setColor(color);
		//filled or not
		System.out.println();
		System.out.println("filled or not filled?, true or false");
		String ans = input.next();
		if(ans.matches("true")) {
			t.setFilled(true);
		}else {
			t.setFilled(false);
		}
		
	
		//sysouts for the values
		System.out.println(t.toString());
		System.out.println("Perimeter= " + t.getPerimeter());
		System.out.println("Area= "+ t.getArea());
		System.out.println("color= "+ t.getColor());
		System.out.println("is fillled="+ t.isFilled());
	}

}
