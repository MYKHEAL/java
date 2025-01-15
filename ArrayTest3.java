public class ArrayTest3{

	public static void main(String[] args) {

	int[]array = {78,90,46,86,98,52,78,85,82,100};

	System.out.printf("%s%8s%n", "index" , "result");
	int count = 0;
	int total = 0;
while(count < 10){
	
	System.out.printf("%3d%8d%n", count , array[count]);
	total +=array[count];


	count++;
}
	System.out.print("The total is: " + total);

}


}