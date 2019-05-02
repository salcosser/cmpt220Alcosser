//Sam Alcosser
//5-1-19
public abstract class Appliance implements Comparable<Appliance> {
	@Override
	public int compareTo(Appliance arg0) { //taken from comparable
		// TODO Auto-generated method stub
		return 0;
	}
	//attributes
	private int voltage;
	private String color;
	private String madeIn;
	private double price;
	//constructor
	Appliance(int voltage, String color, String madeIn, double price){
		this.voltage = voltage;
		this.color = color;
		this.madeIn = madeIn;
		this.price = price;
	}
	//setters and getters
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getVoltage() {
		return voltage;
	}

	public String getColor() {
		return color;
	}

	public String getMadeIn() {
		return madeIn;
	}
	@Override
	public String toString() {
		return "Appliance [voltage=" + voltage + ", color=" + color + ", madeIn=" + madeIn + ", price=" + price + "]";
	}


	
}
