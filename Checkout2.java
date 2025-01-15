import java.util.ArrayList;
import java.util.Scanner;
public class Checkout2{
		public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("What is the customer name: ");
		String customerName = input.nextLine();
	ArrayList<String> items = new ArrayList<>();
	ArrayList<Integer> quantities = new ArrayList<>();
	ArrayList<Double> prices = new ArrayList<>();
	ArrayList<Double> Totals = new ArrayList<>();
	
String response;
double Total = 0;
double money;
boolean addMore;
	
		do{
			
			System.out.println("What did the user buy? ");
			String item = input.nextLine();
			items.add(item);
			
			
			
		System.out.println("How many pieces? ");
		int quantity = input.nextInt();
		while (quantity < 1){
			System.out.println("Invalid number wimp!!! try a positive number ");
			quantity = input.nextInt();
			
		}
			quantities.add(quantity);
		
		System.out.println("How much per pieces? ");
		double price = input.nextDouble();
		prices.add(price);
		
			while (price < 1){
				System.out.println("invalid number wimp!!! try a positive number");
				price = input.nextDouble();
			}
	
				prices.add(price);	
			
			
		System.out.println("add more item (yes / No)?");
		input.nextLine();
		response = input.nextLine();
		addMore = response.equalsIgnoreCase("yes");
		
		
		
		double TotalAmount = quantity * price;
		Total = Total + TotalAmount;
		Totals.add(TotalAmount);
		
			
		}while(addMore);
		
		System.out.println("what is the your name? ");
		String cashierName = input.nextLine();
		System.out.println("how much discount is he/she collecting");
		double discount = input.nextDouble();
		
		
		
		
		
		
		double subTotal = Total;
		 double vat = subTotal * 0.175;
		
        double discountAmount = discount / 100;
		double realDiscount = discountAmount * subTotal;
		
        double billTotal = subTotal + vat - discountAmount;
		
		
		
		
		
		
		System.out.print("""
		====================================================================
		SEMICOLON STORES
		MAIN BRANCH
		LOCATION:HERBERT MACAULAY WAY,SABO YABA, LAGOS
		TEL:07035309979
		DATE: YOU ALREADY KNOW
			""");
			System.out.println("NAME: " + customerName);
			System.out.println("CUSTOMER NAME: " + customerName);
		System.out.print("""
		===========================================================================================================
		""");
		
		
		System.out.printf("%-15S%-5S%-10S%-15S%n", "item" , "qty" , "price" , "total(ngn)");
		System.out.println("""
		------------------------------------------------------------------------------------------------------------
		""");
		
				for(int i = 0; i < items.size(); i++){
		
					 System.out.printf("%-15s%-5d%-10.2f%-15.2f%n", items.get(i), quantities.get(i), prices.get(i), Totals.get(i));
        }
System .out.print("""
---------------------------------------------------------------------------------------------------------------------
""");

	System.out.println("sub total: " + subTotal);
	System.out.println("discount: " + realDiscount);
	System.out.println("Vat @ 17.50: " + vat);
	System.out.print("""
-----------------------------------------------------------------------------------------------------------------------	
	""");
	
	System.out.println("Total: " + billTotal);
	System.out.print("""
-----------------------------------------------------------------------------------------------------------------------	
	""");
	while(true){
	
		System.out.println("How much did the user give to you ?");
		money = input.nextDouble();
		if (money < billTotal){
			System.out.println("Insufficient amount try again");
		}else{
				break;
		}
	}
	
	
	System.out.print("""
		====================================================================
		SEMICOLON STORES
		MAIN BRANCH
		LOCATION:HERBERT MACAULAY WAY,SABO YABA, LAGOS
		TEL:07035309979
		DATE: YOU ALREADY KNOW
			""");
			System.out.println("NAME: " + customerName);
			System.out.println("Cashier NAME: " + cashierName);
		System.out.print("""
		===========================================================================================================
		""");
		
		
		System.out.printf("%-15S%-5S%-10S%-15S%n", "item" , "qty" , "price" , "total(ngn)");
		System.out.println("""
		------------------------------------------------------------------------------------------------------------
		""");
		
		
				for(int i = 0; i < items.size(); i++){
		
					 System.out.printf("%-15s%-5d%-10.2f%-15.2f%n", items.get(i), quantities.get(i), prices.get(i), Totals.get(i));
        }
System .out.print("""
---------------------------------------------------------------------------------------------------------------------
""");

	System.out.println("sub total: " + subTotal);
	System.out.println("discount: " + realDiscount);
	System.out.println("Vat @ 17.50: " + vat);
	System.out.print("""
--------------------------------------------------------------------------------------------------------------------------	
""");
	System.out.println("Total: " + billTotal);
	System.out.println("Amount paid: " + money);
	double balance = money - billTotal;
	System.out.println("Balance is: " + balance );
	
						
					
		
		
		

	
		
		}


	}