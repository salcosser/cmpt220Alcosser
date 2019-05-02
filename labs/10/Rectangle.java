//Sam Alcosser
//5-1-19
public class Rectangle implements Printable {
	//attributes
	public int l;
	public int h;
	
	//constructor
	public Rectangle(int l, int h) {
		super();
		this.l = l;
		this.h = h;
	}


	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("This is a rectangle with a length of " + l +  " and a height of "+ h +".");
	}
	

}
