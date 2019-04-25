//Sam Alcosser
//4/17/19

public class Triangle extends GeometricObject{
	//setting up the attributes
	private double side1 =1.0;
	private double side2 =1.0;
	private double side3 = 1.0;
	//no-arg constuctor
	Triangle(){
		super();
	}
	//arg constructor with changes to throw exceptions in the case of an illegal triangle
	Triangle(double side1, double side2, double side3) throws IllegalTriangleException{
		if(((side1 + side2) <= side3) || ((side2 + side3) <= side1) || ((side1  + side3) <= side2)) {
			throw new IllegalTriangleException();
		}
		
		
		
		
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	//utilizing a function to get the area
	 public double getArea() {
         double s = getPerimeter()/2.0;
         System.out.println(s);
		 double  area=Math.sqrt(s*(s-this.side1)* (s-this.side2)* (s-this.side3));
         return area;
	    }
	 //simple addition for the perimeter
	 public double getPerimeter() {
		 return (double) (this.side1 + this.side2 + this.side3);
	 }
	 //eclipse generated toString method, and setters and getters
	@Override
	public String toString() {
		return "Triangle: side ="+ side1 + " side2=" + side2 + " side3= " + side3;
	}
	public double getSide1() {
		return side1;
	}
	public void setSide1(double side1) {
		this.side1 = side1;
	}
	public double getSide2() {
		return side2;
	}
	public void setSide2(double side2) {
		this.side2 = side2;
	}
	public double getSide3() {
		return side3;
	}
	public void setSide3(double side3) {
		this.side3 = side3;
	}
}
