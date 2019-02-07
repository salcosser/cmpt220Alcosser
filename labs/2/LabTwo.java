// Sam Alcosser
//2-6-2019
//main executing class
public class LabTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		compare comp = new compare();
//getting both numbers
		comp.input();
//running tests
		comp.lThan();
		comp.lThanEqual();
		comp.eqTo();
		comp.nEqual();
		comp.gThan();
		comp.gThanEqual();
		
		// number to month function
		numToMonth mon = new numToMonth();
		mon.convert();
		// random number generator between two values
		limits rand = new limits();
		rand.randLim();
		
		//converter that takes a charachter as an input and outputs an integer value
		charToNum charnum = new charToNum();
		charnum.convert();
		
		//function that lexicographically orders two strings
		lexoCompare lexo = new lexoCompare();
		lexo.compare();
	
		//random phone number generator
		randPhone teleNum = new randPhone();
		teleNum.phoney();
	}

}
