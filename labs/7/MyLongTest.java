//Sam Alcosser
//3-4-19
//testing the long class
public class MyLongTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating three longs to use
		MyLong l1 = new MyLong(77);
		MyLong l2 = new MyLong(77);
		MyLong l3 = new MyLong(123);
		//testing and printing the results for each function
		System.out.print("get the value of l1: ");
		System.out.println(l1.getLong());
		System.out.print("is l1's value even: ");
		System.out.println(l1.isEven());
		System.out.print("is l1's value odd: ");
		System.out.println(l1.isOdd());
		System.out.print("is l1's value prime: ");
		System.out.println(l1.isPrime());
		System.out.print("is 12 even: ");
		System.out.println(MyLong.isEven(12));
		System.out.print("is 13 odd: ");
		System.out.println(MyLong.isOdd(13));
		System.out.print("is 1423 prime: ");
		System.out.println(MyLong.isPrime(1423));
		System.out.print("is the value of l1 even: ");
		System.out.println(MyLong.isEven(l1));
		System.out.print("is the value of l2 odd: ");
		System.out.println(MyLong.isOdd(l2));
		System.out.print("is the value of l3 prime: ");
		System.out.println(MyLong.isPrime(l3));
		
		
		//creating a test set of chars
		char[] set = {'3','4','5'};
		
		System.out.println(MyLong.parseLong(set)); // using the parseLong function that takes a set of chars
		System.out.println(MyLong.parseLong("345")); //using the parseLong function that takes a string as input
	}

}
