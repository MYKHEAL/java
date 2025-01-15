import java.util.Scanner;
public class PackageCalculation{
	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.println("""

	|Collection Rate|Amount Per Parcel|Base Pay|
	|,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,|
	|less than 50%  |    160          |  5,000 |
	|,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,
	|50_59%         |     200         |  5,000 |
	|,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,
	|60_69%         |     250         |  5,000 |
	|,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,
	|>=70%          |     500         |  5,000 |
	|,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,


""");
	int packages;
	
	while (true) {

	System.out.println("Enter the number of successful delivered packages (1 to 100%) ");
	packages = input.nextInt();	
	if (packages < 1){
	System.out.print("invalid number");
}else{
	break;
}

	}

	int AmountPerParcel = 0;
	int BasePay = 0;
	if (packages < 50){
	AmountPerParcel = 160;
	System.out.println("your Amount per parcel is: " + AmountPerParcel);
	BasePay = 5000;
	System.out.println("your Base pay is: " + BasePay);
	double SuccessfulDelivery = packages * AmountPerParcel + BasePay;
	System.out.print("total is: " + SuccessfulDelivery);	
}
	
	if (packages > 49 && packages < 60){
	AmountPerParcel = 200;
	System.out.println("your Amount per parcel is: " + AmountPerParcel);
	BasePay = 5000;
	System.out.println("your Base pay is: " + BasePay);
	double SuccessfulDelivery = packages * AmountPerParcel + BasePay;
	System.out.print("total is: " + SuccessfulDelivery);	
}
	if (packages > 59 && packages < 70){
	AmountPerParcel = 250;
	System.out.println("your Amount per parcel is: " + AmountPerParcel);
	BasePay = 5000;
	System.out.println("your Base pay is: " + BasePay);
	double SuccessfulDelivery = packages * AmountPerParcel + BasePay;
	System.out.print("total is: " + SuccessfulDelivery);	
}
	if (packages >= 69){
	AmountPerParcel = 500;
	System.out.println("your Amount per parcel is: " + AmountPerParcel);
	BasePay = 5000;
	System.out.println("your Base pay is: " + BasePay);
	double SuccessfulDelivery = packages * AmountPerParcel + BasePay;
	System.out.print("total is: " + SuccessfulDelivery);	
}	


}




   }