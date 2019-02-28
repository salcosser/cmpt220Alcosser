//Sam Alcosser
//2-20-19
import java.util.Arrays;
//Write a Java program that stores a list of positive numbers into an array. The end of the
//list is represented by the value -1. Write two methods, one to add a number at the end
//of the list and another one to add a number in a specific position in the list. Insert
//numbers 1 through 10 (in that order) into the array using the first method, print the
//values in the array and the insert 10 in position 3 and 100 in position 7 using the second
//method and print the array again.
public class arrayChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating and pre filling the int list
		int[] holder = new int[100];
		fill(holder, 9);
		//showing the values of the indexes 3 and 7 before editing their values
		System.out.println("values in their indexes before the listEdit function:");
		System.out.println(holder[3] + " "+ 3);
		System.out.println(holder[7] + " "+ 7);
		//using a new way to modify the array
		newWay(holder, 3, 10);
		newWay(holder, 7, 100);
		//showing how the listEdit function changed the values
		System.out.println("values in their indexes after the listEdit function:");
		System.out.println(holder[3] + " "+ 3);
		System.out.println(holder[7] + " "+ 7);
		System.out.println("");
		
		for(int i:holder) {
			System.out.println(i);
		}
	}
	//simple function which will fill an integer list however much the user wants and then puts a -1 at the end of filling it
	public static void fill(int[] list, int range) {
		int indCount = -1;
		for(int i = 0;i<= range;i++) {
			list[i] = i+1;
			indCount++;
		}
		list[range+1] = -1; 
	}

	//abstract concept which inserts a value into a designated index and shifts all values after down
	public static void newWay(int[] list,int pos, int x) {
		int n = 0;
		while(list[n] != -1) {
			n++;
		}
		n ++;
		for(int i = (n-1); i >= (pos-1); i--){
	            list[i+1] = list[i];
	    }
	    list[pos] = x;
	}
}
