//Sam Alcosser
//5-1-19
public class Telephone extends Appliance {
//specific attributes
	public String brand;
	public int modelNum;
public Telephone(int voltage, String color, String madeIn, double price, String brand, int modelNum) {
	super(voltage, color, madeIn, price);
	this.brand = brand;
	this.modelNum = modelNum;
}
@Override //now uses the super to both print the general attributes and the item specific ones
public String toString() {
	return super.toString() + "Telephone [brand=" + brand + ", modelNum=" + modelNum + "]";
}


}
