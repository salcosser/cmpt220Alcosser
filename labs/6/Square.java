//Sam Alcosser
//3-27-19
//Square class
public class Square {
	double width = 1; // single value
	//constructors
	Square(){}; //no-arg
	Square(double width){;
	this.width = width;
	}
	
	//getting the area and the perimeter
	public double getArea() {
		return width * width;
	} 
	public double getPerimeter() {
		return width * 4;
	}
}
