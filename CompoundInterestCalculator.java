import java.util.Scanner;
public class CompoundInterestCalculator{
	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
double InitialInvestment;	
int LengthOfTimeInYears;
double InterestRate;

while(true) {
	System.out.println("Enter your initial investment: ");
	InitialInvestment = input.nextDouble();
	if (InitialInvestment < 1){
	System.out.print("Invalid number");
}else{
	break;
}


	System.out.println("Enter the length of time,in years,that you plan to save: ");
	LengthOfTimeInYears = input.nextInt();
	if (LengthOfTimeInYears < 1){
	System.out.print("Invalid number");
}else{
	break;
}
	System.out.println("enter your estimated annual rate: ");
	InterestRate = input.nextDouble() / 100;
	if (InterestRate < 1){
	System.out.print("Invalid number");
}else{
	break;
}

	}

	


 System.out.println("How often will the interest be compounded?");
        System.out.println("Enter 1 for Daily, 2 for Monthly, 3 for Annually: ");
        int compoundingOption = input.nextInt();

        int CompoundFrequency = 0;

        
        switch (compoundingOption) {
            case 1: 
                CompoundFrequency = 365;
                break;
            case 2: 
                CompoundFrequency = 12;
                break;
            case 3: 
                CompoundFrequency = 1;
                break;
            default:
                System.out.println("Invalid choice. Setting compounding frequency to annually (1).");
                CompoundFrequency = 1;
        }

	double InitialInvestment;	
int LengthOfTimeInYears;        

        double finalAmount = InitialInvestment * Math.pow(1 + (InterestRate / CompoundFrequency), CompoundFrequency * LengthOfTimeInYears);
        double compoundInterest = finalAmount - InitialInvestment; 

        System.out.println("The compound interest earned is: " + compoundInterest);
        System.out.println("The final amount (principal + interest) is: " + finalAmount);
    }
}

	