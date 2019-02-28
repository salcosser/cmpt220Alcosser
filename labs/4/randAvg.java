//Sam Alcosser
//2-20-19
//Write a Java program that generates 1000 random integers, calculates the average and
//prints two counts, one for the numbers lower than the average and one for the numbers
//larger than the average
public class randAvg {
//main function which creates an array of 1000 random integers from 0 to 100 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] holder = new int[1000];
		for(int i = 0;i< holder.length;i++) {
			holder[i] = (int)(Math.random() * 100);
		}
		aboveOrBelow(holder);
	}
//finds the average of the array by adding all values up and dividing by the length of the array
 public static double arrayAvg(int[] bigArray) {
	 int container = 0;
	 for(int i: bigArray) {
		 container += i;
	 }
	 return (double)container/bigArray.length;
 }
 // simply compares each value in an array using a for loop if they are above or below its average, then counts them in variables
 public static void aboveOrBelow(int[] bigArray) {
	 int above = 0;
	 int below = 0;
	 double avg = arrayAvg(bigArray);
	 for(int i: bigArray) {
		 if(i > avg) {
			 above++;
		 }else if(i< avg) {
			 below++;
		 }
	 }
	 System.out.println("within an array with a length of " + bigArray.length + " and an average of "+ avg);
	 System.out.println("there are "+ above + " numbers above the average, and " + below + " numbers below the average");
 }
}
