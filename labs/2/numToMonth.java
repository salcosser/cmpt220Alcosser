import java.util.Scanner;

// Sam Alcosser
//2-6-2019
//converting numbers to months
public class numToMonth {
Integer monthNum;

public void convert() {
	//create and use scanner to get the number of the month
	Scanner input = new Scanner(System.in);
	System.out.println("What is the number of the month?");
	 Integer monthNum = input.nextInt();
	String month = null;
	//use a switch case to assign the number to a month
	switch(monthNum) {
	case 1:
		month = "January";
		break;
	case 2:
		month = "February";
		break;
	case 3:
		month = "March";
		break;
	case 4:
		month = "April";
		break;
	case 5:
		month = "May";
		break;
	case 6:
		month = "June";
		break;
	case 7:
		month = "July";
		break;
	case 8:
		month = "August";
		break;
	case 9:
		month = "September";
		break;
	case 10:
		month = "October";
		break;
	case 11: 
		month = "November";
		break;
	case 12:
		month = "December";
		break;
	default:
		System.out.println("Please input a valid number from 1 to 12");
	}
	System.out.println("This month is "+ month + ".");

}
}