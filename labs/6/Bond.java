//Sam Alcosser
//3-27-19
//bond class
public class Bond {
 //attributes definitions
 double coupon;
 int payments;
 double interest;
 double valueMaturity;
 //no arg constructor
 Bond(){};
 //constructor with definitions
 Bond(double coupon, int payments, double interest, double valueMaturity){
	 this.coupon = coupon;
	 this.payments = payments;
	 this.interest = interest;
	 this.valueMaturity = valueMaturity;
 }
 //function to compute the price of the bond
 public double getPrice() {
	return (coupon * (1-(1/Math.pow(1+interest, payments)))) + (valueMaturity * (1/Math.pow(1+interest,  payments)));
 }
}