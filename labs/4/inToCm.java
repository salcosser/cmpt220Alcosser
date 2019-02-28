//Sam Alcosser
//2/19/19
//Write a Java program that show a table of with the conversion from inches to
//centimeters and from centimeters to inches. In50 rows increment the inches by 1 and
//the centimeters by 5.
public class inToCm {
// main function that assembles all of the output using funcitons
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//formatting
		//System.out.println(" in      cm | cm       in");
		System.out.printf("%-5s%5s%s%-5s%5s%n", "in", "cm","|","cm","in");//%-5s%5s%s%-5s%5s%n
		System.out.println("---------------------------");
//keeping track of the different counter for the incrementing of  the cm
		int cmCount = 1;
//main loop that formats the output
		for(int i= 1;i<=50;i++) {
			System.out.printf(i + "%8.2f" + " | " + cmCount + "%8.2f",inchToCm(i), cmToIn(cmCount));
			System.out.println();
			cmCount+=5;
		}
	}
	//two functions going from inches to centimeters and the other way around
	public static double inchToCm(int n) { 
		return (n * 2.54);
	}
	public static double cmToIn(int n) {
		return (n * 0.393701 );
	}
}
