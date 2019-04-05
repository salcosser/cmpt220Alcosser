//Sam Alcosser
//3-4-19
public class Circle {
	//making the attributes
	private double x;
	private double y;
	private double radius;
	//no-arg constructor makes a base circle
	Circle(){
	this.x = 0;
	this.y = 0;
	this.radius = 1;
	}
	//arg constructor takes parameters for the coordinates of the centerpoint and the radius
	Circle(double x, double y, double radius){
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	//getters for the three attributes
	public double getX() {
		return this.x;
	}
	public double getY() {
		return this.y;
	}
	public double getRadius() {
		return this.radius;
	}
	//applying a simple equation to find the area of the circle
	public double getArea() {
		return Math.PI * Math.pow(this.radius, 2);
	}
	//applying another equation to find the perimeter
	public double getPerimeter() {
		return 2 * Math.PI * this.radius;
	}
	//testing if a point is within the circle
	public boolean contains(double x, double y) {
		if(Math.pow((x - this.x),2) + Math.pow((y - this.x),2) < Math.pow(this.radius, 2)) {
			return true;
		}
		else {
			return false;
		}
	}
	//testing if another circle is inside of the first one
	public  boolean contains(Circle c2) {
		 double d = Math.sqrt( Math.pow((c2.x -this.x), 2) + Math.pow((c2.y-this.y),2) );
		 if(this.radius > (d + c2.radius)) {
			 return true;
		 }
		 else {
			 return false;
		 }
	}
	//testing if two circles overlap
	public  boolean overlap(Circle c2) {
		double a = (this.radius - c2.radius);
		double b = (Math.sqrt(Math.pow((this.x - c2.x), 2)  + Math.pow((this.y-c2.y), 2))) ;
		double c =  (this.radius + c2.radius);
		if((a <= b) ||(b< c)){
			return true;
		}
		else {
			return false;
		}

}
}
	
