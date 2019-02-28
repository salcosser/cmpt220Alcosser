import java.util.Arrays;
import java.util.Scanner;
//Sam Alcosser
//2-20-19
//Write a Java program to remove duplicate values from an array. Get a list of numbers
//from the user, store them into an array remove the duplicates and print the contents of
//the array.
public class noRepeat_1 {
	public static void main(String[] args){        
		// TODO Auto-generated method stub
		int[] holder = new int[100];
		//taking in the number of the numbers and the numbers themselves
		Scanner input = new Scanner(System.in);
		System.out.println("How many integers would you like to parse out?");
		int holdLen = input.nextInt();
		System.out.println("what are the numbers?");
		//inputing the numbers
		for(int i = 0; i<=holdLen-1;i++) {
			holder[i] = input.nextInt();
		}	
		//weeding out the empty indexes
		int[] ending = new int[holdLen];
		int endLen = ending.length;
		int innerInd = 0;
		for(int i=0;i<=99;i++) {
			if(holder[i] != 0) {
				ending[innerInd] = holder[i];
				innerInd++;
			}
		}
    	remRepeats(ending);
         

         
      }   
	public static void remRepeats(int[] list) {
		//getting the length of the list
        int len = list.length;
        //Comparing each element with all other elements
        for (int i = 0; i < len; i++){
            for (int j = i+1; j < len; j++){
                //testing if elements are the same
                if(list[i] == list[j]){
                    //Replace duplicate element with last unique element
                    list[j] = list[len-1];
                    len--;
                     
                    j--;
                }
            }
        }
        //making a list of the non repeated elements
        int[] array1 = Arrays.copyOf(list, len);
        //printing array1
        for (int i = 0; i < array1.length; i++){
            System.out.println(array1[i]);
        }
         
    }
     
     
}
