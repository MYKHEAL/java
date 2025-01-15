import java.util.Scanner;
public class CheckOut{

	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	System.out.println("what is the customer name: ");
	String name = input.nextLine();
	int count = 0;
while(true){
	System.out.println("what did the user buy?");
	String item = input.nextLine();

	System.out.println("How many pieces?");
	int pieces = input.nextInt();

	System.out.println("How much per pieces?");
	double Hmp = input.nextDouble();
	input.nextLine();

	System.out.print("Add more item(yes or no)" );
	String More = input.nextLine().trim().toLowerCase();
	
	if (More.equals("yes")){
	continue;
}else{
	break;
	
}	
}
	System.out.println("What is your name?");
	String CashierName = input.nextLine();

	System.out.println("How much discount will he get?");
	double discount = input.nextDouble();
	System.out.println("How much did user give you?");
	double Payment = input.nextDouble();



	System.out.print("""
SEMICOLON STORES


MAIN BRANCH


LOCATION: 312, HERBERT MACAULAY WAY, SABO, YABA, LAGOS.


TEL: 03293828343


DATE: 4-JAN-25  12:30:12 pm


""");

	System.out.print("Cashier's Name: ");
	String cashierName = input.nextLine();
	System.out.print("Customer Name: ");
	String CustomerName = input.nextLine();
	


	System.out.print("""
===========================================================================================
""");
	
	System.out.printf("%-15S%-5S%-10S%-15S%n", "item" , "qty" , "price" , "total(ngn)");

	int numItems = input.nextInt();
	input.nextLine();
	double total = 0;
for (int i = 0; i < numItems; i++) {
	String item = input.nextLine();
	int qty = input.nextInt();
	input.nextLine();
	double price = input.nextDouble();
	input.nextLine();
	 total = price * qty;
	System.out.printf("%-15S%-5d%-10.2f%-15.2f%n", item , qty , price , total );
	


}

	double subTotal = 0;
	subTotal += total;
	System.out.println("Sub total: " + subTotal);
	double balance = Payment - subTotal;
	System.out.println("your balance is: " + balance);
	

	System.out.println("""
===========================================================================================================
""");
}

}