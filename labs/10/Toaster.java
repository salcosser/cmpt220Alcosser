//Sam Alcosser
//5-1-19
public class Toaster extends Appliance  {
	//specific attributes
	private int maxHeat;
	private int breadCapacity;
	
	public Toaster(int voltage, String color, String madeIn, double price, int maxHeat, int breadCapacity) {
		super(voltage, color, madeIn, price);
		this.maxHeat = maxHeat;
		this.breadCapacity = breadCapacity;
	}

	@Override //now uses the super to both print the general attributes and the item specific ones
	public String toString() {
		return super.toString()  + "Toaster [maxHeat=" + maxHeat + ", breadCapacity=" + breadCapacity + "]";
	}

	
	
	
}
