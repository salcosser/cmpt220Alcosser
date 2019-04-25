//Sam Alcosser
//4-24-19
//creating the exception
public class IllegalTriangleException extends RuntimeException {
 int value;
 //constructor
 IllegalTriangleException(){
	 super("illegal size for triangle");
	 
 };
 //arg constructor
 IllegalTriangleException(String message, int value){
	 super(message);
	 this.value = value;
	 
 }
}
