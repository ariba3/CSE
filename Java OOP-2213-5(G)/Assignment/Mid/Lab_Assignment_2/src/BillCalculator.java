import java.util.Scanner;

 class BillCalculator {
	static double billpay =0;
	
		double calculateBasicBill(double unit) {
		
		if(unit<=199) {
			billpay=unit*1.20;
		}
		else if(unit>=200&&unit<400){
			billpay=unit*1.50;
		}else if(unit>=400&&unit<600) {
			billpay=unit*1.80;
		}
		else {
			billpay = unit*2.00;
		}
		return billpay;
	}
		double calculateSurcharge(double basicBill) {
			double b = calculateBasicBill(billpay);
	        b=billpay*0.15;
			return b;
		}
	
	 class Task_4{
	 public static void main(String[] args) {
			double unit;
			System.out.println("g: ");
			Scanner sc = new Scanner(System.in);
			unit=sc.nextDouble();
			sc.close();
		
			System.out.println(billpay);
		}
	} 

}
