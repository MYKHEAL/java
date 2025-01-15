public class ArrayTest2{

	public static void main(String[] args) {

	int[]array = {78,90,46,86,98,52,78,85,82,100};

	System.out.printf("%s%8s%n", "index" , "result");
	int count = 0;
	int smallest = array[0];
while(count < 10){
	
	System.out.printf("%3d%8d%n", count , array[count]);
	if (array[count] < smallest){
	smallest = array[count];
}


	count++;
}
	System.out.print("The smallest is: " + smallest);

}


}