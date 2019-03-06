import java.util.Arrays;
import java.util.Scanner;

//Sam Alcosser
//3-5-19
//Write a Java program that takes two arrays of integers and says if the arrays are
//identical. The two arrays are identical if they have the same elements, even if they are
//not in the same order. It should use the following method:
//public static boolean equal(int[] x, int[] y)
//Ask the user to enter two sets of values and print the result. The first value indicates the
//number of elements for each array.
public class sameArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//setup
		Scanner input = new Scanner(System.in);
		System.out.println("How many values do you want to have in the first list?");
		//first list intake
		int len1 = input.nextInt();
		System.out.println("What are those values?");
		
		int[] list1 = new int[len1];
		for(int i = 0;i<len1;i++) {
			list1[i] = input.nextInt();
		}
		//second list intake
		System.out.println("How many values do you want to have in the second list?");
		
		int len2 = input.nextInt();
		System.out.println("What are those values?");
		int[] list2 = new int[len2];
		for(int n = 0;n<len1;n++) {
			list2[n] = input.nextInt();
		}
		System.out.println("Are these lists identical? " + equal(list1,list2));
	}
	//simple method implementing the binary search method to search the second list for every thing, and catches if the lists are different lengths
	public static boolean equal(int[] x, int[] y) {
		if(x.length != y.length) {
			return false;
		}
		for(int i =0;i<x.length;i++) {
			if(Arrays.binarySearch(y, x[i])!= -1) {
				continue;
			}else {
				return false;
			}
		}
		return true;
	}
}
