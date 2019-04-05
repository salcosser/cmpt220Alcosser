//Sam Alcosser
//3-4-19
//MyLong wrapper class

public class MyLong {
	
	private long value;		//only real attribute needed
	MyLong(long value) {
		this.value = value;
	}
	//simple getter for the value of the long
	public long getLong(){
		return  value;
	}
	
	//set of functions that return a boolean value on if
	//the value of the long is even, odd, or prime
	 boolean isEven() {
		if(this.value % 2 == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	  boolean isOdd() {
		if(this.value % 2 != 0) {
			return true;
		}
		else {
			return false;
		}
	}
	 boolean isPrime() {
		for(long i = (this.value-1); i>1;i--) {
			if(this.value % i == 0) {
				return false;
			}
			else {
				continue;
			}
			
		}
		return true;
	}
	//static methods to determine if longs are
	//even, odd, or prime
	public static boolean isEven(long val) {
		if(val % 2 == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	public static boolean isOdd(long val) {
		if(val % 2 != 0) {
			return true;
		}
		else {
			return false;
		}
	}
	public static boolean isPrime(long val) {
		for(long i = (val-1); i>1;i--) {
			if(val % i == 0) {
				return false;
			}
			else {
				continue;
			}
			
		}
		return true;
	}
	//static methods that take long objects as arguments
	//and return if the longs are even, odd, or prime
	public static boolean isEven(MyLong longObj) {
		if(longObj.value % 2 == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	public static boolean isOdd(MyLong longObj) {
		if(longObj.value % 2 != 0) {
			return true;
		}
		else {
			return false;
		}
	}
	public static boolean isPrime(MyLong longObj) {
		for(long i = (longObj.value-1); i>1;i--) {
			if(longObj.value % i == 0) {
				return false;
			}
			else {
				continue;
			}
			
		}
		return true;
	}
	//functions that test if two long values or two long objects
	//are of equal value
	public boolean equals(long longVal) {
		return longVal == this.value;
	}
	public boolean equals(MyLong longObj) {
		return longObj.value == this.value;
	}
	//function that converts a set of numbers as characters
	//to a long
	public static  long parseLong(char[] set) {
		int places = set.length;
		long holder = 0;
		int cPlace = 0;
		double addVal = 0;
		for(int i = places-1;i> 0; i--) {
			addVal = ( ( (int) set[cPlace]) - ((int) '0'))* Math.pow(10, i);
			holder+= addVal;
			cPlace+=1;
		}
		holder+=(int) set[cPlace] - (int) '0';
		return holder;
	}
	//function that converts a string of numbers into a long
	public static long parseLong(String s) {
		int len = s.length();
		char[] set = new char[len];
		for(int i = 0; i<len;i++) {
			set[i] = s.charAt(i);
		}
		int places = set.length;
		long holder = 0;
		int cPlace = 0;
		double addVal = 0;
		for(int i = places-1;i> 0; i--) {
			addVal = ( ( (int) set[cPlace]) - ((int) '0'))* Math.pow(10, i);
			holder+= addVal;
			cPlace+=1;
		}
		holder+=(int) set[cPlace] - (int) '0';
		return holder;
	}
}
