import java.util.Scanner;
public class PersonalityTest  {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.println("What is your Name?");
	String Name = input.nextLine();
	int aCount = 0;
	int bCount = 0;

String[] questions = {
	"A)tough-minded,just  B) tender-hearted,merciful",
	"A)candid,straight forward, frank  B) tactful, kind, encouraging",
	"A)focus on here-and-now   B) look to the future, global perspective, big picture",

};

	for(String question : questions) {
	System.out.println(question);
	System.out.print("please respond with either A or B: ");

	String response = input.next().trim().toUpperCase();
	
	while(! response.equals("A") && ! response.equals("B")) {
	System.out.print("Invalid response. please enter A or B: ");

	response = input.next().trim().toUpperCase();

}
	if (response.equals("A")){
	aCount++;
}else{
	bCount++;
}


}
	
	
	System.out.print("\n your Results is:");
	System.out.println("Total A responses: " + aCount);

	System.out.println("Total B responses: " + bCount);
}

	}