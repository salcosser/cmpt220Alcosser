//Sam Alcosser
//4-24-19
public class BinaryString {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//building two strings, one that will work and one that will not
		String bString = "011001110111001";
		String bString2 = "011001114111001";
		try {
			System.out.println("string:011001110111001 ");
			System.out.println(bin2Dec(bString));
			System.out.println("string: 011001114111001");
			System.out.println(bin2Dec(bString2));
		}
		//catching the exception and printing it out
		catch(Exception e) {
			System.out.println("**ERROR**");
			System.out.print("exception: ");
			e.printStackTrace();
		}
		
		
		
	}
	//simple binary string to decimal converter created in class 
	public static double bin2Dec(String binaryString) throws NumberFormatException {
		int number = 0;
		for(int i = 0;i<binaryString.length();i++) {
			if(binaryString.charAt(i)== '1') {
				number+=2;
		
			}else if(binaryString.charAt(i)!='0') {
				throw new NumberFormatException();
			
			}
			number+=2;
		}
		number/=2;
		return number;
	
	}
	
}

