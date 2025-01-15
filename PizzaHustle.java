import java.util.Scanner;
public class PizzaHustle{

	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);


	System.out.printf("%S%4S%6S%10S%9S%12S%n", "welcome" , "to" , "iya" , "michael" , "pizza" , "ventures");
	System.out.print("""
===============================================================================================================
""");
	System.out.println("We are delighted you're here");


	System.out.print("""
====================================================================
                                                                    |
pizza Types    Number of Slices    price per box                    |
--------------------------------------------------------------------|
sapa size           4                 2500                          |
--------------------------------------------------------------------|
small money         6                 2900                          |
--------------------------------------------------------------------|
Big boys            8                 4000                          |
--------------------------------------------------------------------|
Odogwu              12                5200                          |
--------------------------------------------------------------------|

""");



	int Guest;

while (true) {

	
	System.out.println("Enter the number of guests interested in eating pizza: ");
	Guest = input.nextInt();

	if (Guest < 1) {
	System.out.print("not valid enter a positive number: ");
}else{

	break;
}

}


	int[]Number_of_Slices = {4,6,8,12};

	int[]Price_Per_box = {2500,2900,4000,5200};

	String[] pizza_Types = {"Sapa","Small_money","Big_boys","Odogwu" };
	System.out.println("Avaiable pizza types: ");


for(int count = 0; count < pizza_Types.length; count++){
	System.out.printf("%s: %s (%dslices, %d naira)%n", count + 1, pizza_Types[count] , Number_of_Slices[count] , Price_Per_box[count]);

}	
	int pizzaType;

 while (true) {
            System.out.print("Enter the pizza type suitable for you (1-4): ");
            pizzaType = input.nextInt() - 1;

            if (pizzaType >= 0 && pizzaType < pizza_Types.length) {
                break;
            } else {
                System.out.println("Invalid input. Please enter a number between 1 and 4.");
            }
        }

	

  




        System.out.print("Enter how many boxes of the pizza type you want: ");
        int boxes = input.nextInt();



        double totalSlices = boxes * Number_of_Slices[pizzaType];
        System.out.println("The total slices you'll be having is: " + totalSlices);


        double leftOver = totalSlices - Guest;
        System.out.println("The leftover you're going to have is: " + leftOver);


	if (leftOver >= 0){
	System.out.println("This will be more than enough");
}else{
	System.out.println("This won't be enough for the Guest");
}

	double TotalAmount = boxes * Price_Per_box[pizzaType];
	System.out.println("total amount is: " + TotalAmount);
    }
}

	



