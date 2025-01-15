
import java.util.Scanner;
public class StudentGrade {

	public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	
	
int numberOfStudent;
int numberOfSubject;	
	

	while(true){
		System.out.println("Enter the number of student");
		numberOfStudent = input.nextInt();
	if (numberOfStudent < 1){
	System.out.println("Invalid input");
}else{
	break;
}
	
}
	
	while(true){
	System.out.println("How many subject do they offer?:");
	numberOfSubject = input.nextInt();
	if (numberOfSubject < 1){
	System.out.println("invalid input:");
}else{
	break;

}
}
	
	 int[][] scores = new int[numberOfStudent][numberOfSubject];
	
	
	
		for (int studentCount  = 0; studentCount < numberOfStudent; studentCount++){
			System.out.println("\nEntering scores for Student " + (studentCount + 1) + ":");
		
			
			
		 for (int subjectCount = 0; subjectCount < numberOfSubject; subjectCount++) {
                System.out.print("Enter Score for Subject " + (subjectCount + 1) + ": ");
			

		int scoreForSubject = input.nextInt();
		scores[studentCount][subjectCount] = scoreForSubject;
		input.nextLine();
		System.out.print("""
	Saving >>>>>>>>>>>
	Saved Successfully
		""");

	
		 }		


	}
 for (int col = 0; col < numberOfStudent; col++) {
                scores[numberOfStudent][col] = (numberOfStudent + 1) * (col + 1);
		
            }

 for (int col = 0; col < numberOfSubject; col++) {
		System.out.print(scores[numberOfSubject][col] + "");
		 }		


}


}