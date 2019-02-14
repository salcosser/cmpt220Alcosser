//Sam Alcosser
//2-13-19
//Write a program that finds the largest n such that n is a prime number and n < 15,000.
public class bigNum {
	public static void main(String[] args) {
		//keeps track of the starting integer
		Integer lgNum = 15000;
		//simple for loop that implements the isPrime method developed in class
		for(int i =15000;i<=15000;i-- ) {
			if(isPrime(i)) {
				System.out.println("The biggest prime number is: " + i);
				break;
			}else {
				continue;
			}
}
	}
		// function that finds if the number is prime by checking every possible divisor, other than 1 for obvious reasons, for the given number
		private static boolean isPrime(int number) {
			for(int divisor = 2; divisor <= number /2 ; divisor++) {
				if (number % divisor == 0) {
					return false;
			}
			
		}
			return true;

		}
	}