//Sam Alcosser
//4-18-19

import java.util.ArrayList;
import java.util.Scanner;

//prompt 5 numbers in an array list sort
public class Sorter {
	static ArrayList<Integer> list = new ArrayList<>();
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("please input 5 numbers on one line");
		for(int i = 0;i<5;i++) {
			list.add(input.nextInt());
		}
	//implement selection sort	
		selSort(list);
	}
	//selection sort algorithm pulled from a previous lecture and modified to utilize array lists
	public static void selSort(ArrayList<Integer> list) {	
		for (int i = 0; i < list.size(); i++) {
			int currentMin =list.get(i);
			int currentMinIndex = i;
			for (int j = i + 1; j < list.size(); j++) {
				if (currentMin > list.get(j)) {
					currentMin = list.get(j);
					currentMinIndex = j;
				}
			}
			
			if (currentMinIndex != i) {
				
				list.set(currentMinIndex, list.get(i));
				
				list.set(i, currentMin);
			
			}
		}
		//iterating through the list to print out all values
	System.out.println("final");
		for(int k = 0;k<list.size();k++) {
		System.out.print(" "+ list.get(k) + " ");
	}
	}
}

