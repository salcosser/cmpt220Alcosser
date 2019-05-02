//Sam Alcosser
//5-1-19
public class TV extends Appliance {
	//specific attributes
	public int resolution;
	public double size;
	public TV(int voltage, String color, String madeIn, double price, int resolution, double size) {
		super(voltage, color, madeIn, price);
		this.resolution = resolution;
		this.size = size;
	}
	@Override //now uses the super to both print the general attributes and the item specific ones
	public String toString() {
		 return super.toString() + "TV [resolution=" + resolution + ", size=" + size + "]";
	}
	

}
