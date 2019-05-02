//Sam Alcosser
//5-1-19
import java.util.ArrayList;

public class TestApp {

		public static void main(String[] args){
		
		ArrayList<Appliance> appliances = new ArrayList<>(); //creating the arraylist to hold the 40 appliances
		
		//creating 40 distinct appliances, TVs, toasters, and telephones
		appliances.add(new Toaster(5, "Blue", "China", 63.40, 44, 7));
		appliances.add(new TV(500, "black", "China", 599.99, 1080, 42));
		appliances.add(new Telephone(12, "gold", "China", 899, "samsung", 428456));
		appliances.add(new Toaster(240, "orange", "China", 34.60, 44, 7));
		appliances.add(new TV(500, "sky blue", "China", 59.99, 1080, 42));
		appliances.add(new Telephone(12, "burnt sienna", "China", 8.00, "Huawei", 428456));
		appliances.add(new Toaster(5, "baby blue", "China", 60000.00, 44, 7));
		appliances.add(new TV(500, "silver", "China", 799.99, 1080, 42));
		appliances.add(new Telephone(12, "matte black", "China", 32.48, "apple", 428456));
		appliances.add(new Toaster(5, "brown", "China", 60.79, 44, 7));
		appliances.add(new TV(500, "turquoise", "China", 19.99, 1080, 42));
		appliances.add(new Telephone(12, "sea green", "China", 234, "motorola", 428456));
		appliances.add(new Toaster(5, "lime green", "China", 6234567, 44, 7));
		appliances.add(new TV(500, "burnt umber", "China", 5677, 1080, 42));
		appliances.add(new Telephone(12, "white", "China", 9698, "xiomi", 428456));
		appliances.add(new Toaster(5, "gray", "China", 1244, 44, 7));
		appliances.add(new TV(500, "slate gray", "China", 14556, 1080, 42));
		appliances.add(new Telephone(12, "rose gold", "China", 7576, "oneplus", 428456));
		appliances.add(new Toaster(5, "purple", "China", 75965, 44, 7));
		appliances.add(new TV(500, "neon green", "China", 164, 1080, 42));
		appliances.add(new Toaster(5, "neon yellow", "China", 67887, 44, 7));
		appliances.add(new TV(500, "light blue", "China",999.99, 1080, 42));
		appliances.add(new Telephone(12, "maroon", "China", 234676, "sony", 428456));
		appliances.add(new Toaster(5, "indigo", "China", 7848, 44, 7));
		appliances.add(new TV(500, "violet", "China", 2366, 1080, 42));
		appliances.add(new Telephone(12, "mauve", "China", 8678, "google", 428456));
		appliances.add(new Toaster(5, "chalkboard black", "China", 1, 44, 7));
		appliances.add(new TV(500, "topaz", "China", 49.99, 1080, 42));
		appliances.add(new Telephone(12, "taupe", "China", 67, "razer", 428456));
		appliances.add(new Toaster(5, "beige", "China", 53434, 44, 7));
		appliances.add(new TV(500, "wood", "China", 5.99, 1080, 42));
		appliances.add(new Telephone(12, "metal flake blue", "China", 543, "red", 428456));
		appliances.add(new Toaster(5, "iridecent", "China", 687, 44, 7));
		appliances.add(new TV(500, "brushed metallic silver", "China", 3467, 1080, 42));
		appliances.add(new Telephone(12, "seafoam green", "China", 8678, "nokia", 428456));
		appliances.add(new Toaster(5, "hazel", "China", 546, 44, 7));
		appliances.add(new TV(500, "red", "China", 686, 1080, 42));
		appliances.add(new Telephone(12, "pale violet red", "China", 58645, "htc", 428456));
		appliances.add(new Toaster(5, "chocolate", "China", 7698, 44, 7));
		appliances.add(new TV(500, "vanta black", "China", .99, 1080, 42));
	
		//showing the list before selection sorting
		System.out.println("");
		System.out.println("Before");
		System.out.println("");
		for(int i= 0;i<appliances.size();i++) {
			System.out.println( (i+1) + " : " + appliances.get(i).toString());
		}
		//implementation of a selection sort algorithm
		selSort(appliances);
		//showing the resulting  sorted list
		System.out.println("");
		System.out.println("After");
		System.out.println("");
		for(int i= 0;i<appliances.size();i++) {
			System.out.println( (i+1) + " : " + appliances.get(i).toString());
		}
		}
		
		//selection sort algorithm slightly modified from lab 8 to look at the value of the price attribute of the appliances
		public static void selSort(ArrayList<Appliance> list) {	
			for (int i = 0; i < list.size(); i++) {
				Appliance currentMin =list.get(i);
				int currentMinIndex = i;
				for (int j = i + 1; j < list.size(); j++) {
					if (currentMin.getPrice() > list.get(j).getPrice()) {
						currentMin = list.get(j);
						currentMinIndex = j;
					}
				}
				
				if (currentMinIndex != i) {
					
					list.set(currentMinIndex, list.get(i));
					
					list.set(i, currentMin);
				
				}
			}
}
}
