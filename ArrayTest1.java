public class ArrayTest1{

	public static void main(String[] args) {

	int[]array = {78,90,46,86,98,52,320,85,82,100};

	System.out.printf("%s%8s%n", "index" , "result");
	int count = 1;
	int largest = 0;
	int smallest = largest;
while(count < 10){
	
	System.out.printf("%3d%8d%n", count , array[count]);
	if (largest <= array[count]){
	largest = array[count];
}
	if (smallest <= array[count]){
	smallest = array[count];
}
	count++;
}
	System.out.println("The largest is: " + largest);
	System.out.println("The smallest is: " + smallest);
}


}