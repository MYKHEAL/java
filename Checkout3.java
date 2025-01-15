import java.util.ArrayList;
import java.util.Scanner;
public class Checkout3 {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.println("What is the buyer name:");
	String buyerName = input.nextLine();
	
	
	
	boolean addMore;
	String cashierName;
	double discount;
	double totalAmount;
	double Total;
	
	
	
	
	
	ArrayList<String> name = new ArrayList<>();
	ArrayList<Integer> quantity = new ArrayList<>();
	ArrayList<Double> price = new ArrayList<>();
	ArrayList<Double> total = new ArrayList<>();
	
	do{
	
		System.out.println("What did the user buy?: ");
		String names = input.nextLine();
		name.add(names);
		
		
		System.out.println("how many quantity of item did the user? : ");
		int quantitys = input.nextInt();
		while(quantitys < 1) {
		System.out.println("Invalid number try positive number");
		}
		quantity.add(quantitys);
		input.nextLine();
		
		
		System.out.println("How much per quantity is the item? :");
		double priceOfQuantity = input.nextDouble();
		while(priceOfQuantity < 1) {
		System.out.println("Invalid number try positive number");
		}
		price.add(priceOfQuantity);
		
		System.out.print("do you wish to add more item (yes / no):");
		input.nextLine();
		String response = input.nextLine();
		addMore = response.equalsIgnoreCase("yes");
		
		totalAmount = quantitys *  priceOfQuantity;
		Total =+ totalAmount;
		total.add(totalAmount);
		
		
	}while(addMore);
	
		System.out.println("what is your Name");
		cashierName = input.nextLine();
		System.out.println("how much discount is the customer receiving? :");
		double discounts = input.nextDouble();
		input.nextLine();
		
		
		 double vat = totalAmount * 0.175;
		 
		discount = discounts / 100;
		double totalDiscount = discount * Total;
		
		 double billTotal = Total + vat - totalDiscount;
		 
		
		
		receipt ("""
		====================================================================
		SEMICOLON STORES
		MAIN BRANCH
		LOCATION:HERBERT MACAULAY WAY,SABO YABA, LAGOS
		TEL:07035309979
		DATE: YOU ALREADY KNOW
			""");
			System.out.println("NAME: " + cashierName );
			System.out.println("CUSTOMER NAME: " + buyerName);
		System.out.print("""
		===========================================================================================================
		""");
		
		
		System.out.printf("%-15S%-5S%-10S%-15S%n", "item" , "qty" , "price" , "total(ngn)");
		System.out.println("""
		------------------------------------------------------------------------------------------------------------
		""");
		
		}
		public static void receipt(String noble) {
				System.out.println(noble);
		}
				for(int i = 0; i < names.size(); i++){
		
					 System.out.printf("%-15s%-5d%-10.2f%-15.2f%n", name.get(i), quantity.get(i), prices.get(i), total.get(i));
        }
		System.out.print(""
---------------------------------------------------------------------------------------------------------------------
""");

	//System.out.println("sub total: " + totalAmount);
	//System.out.println("discount: " + discounts);
	//System.out.println("Vat @ 17.50: " + vat);
	//System.out.print("""
-----------------------------------------------------------------------------------------------------------------------	
	//""");
	
	//System.out.println("Total: " + billTotal);
	//System.out.print("""
-----------------------------------------------------------------------------------------------------------------------	
	""");
	//while(true){
	
		//System.out.println("How much did the user give to you ?");
		//money = input.nextDouble();
		//if (money < billTotal){
		//	System.out.println("Insufficient amount try again");
		//}else{
				//break;
		//}
	//}
	
		}
		
		
		
		
		
	
	
	
	
	
	
	





	}