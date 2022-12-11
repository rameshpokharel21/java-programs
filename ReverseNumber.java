/*
 * reverse an integer
 */

 package java_programs;

 import java.util.Scanner;


 public class ReverseNumber{

	/*
	 * @return an int 
	 * @param num takes in int
	 * The trick is modify reverse by multiplying 
	 * previous reverse number by 10 and adding 
	 * remainder that is received by mod 10.
	 * Lastly update number by integer division by 10.
	 * Repeat process until num becomes 0
	 */
	 public static int reverseInt(int num){
	 	int reverse = 0;

	 	while(num != 0){
	 		int remainder = num % 10;
	 		reverse = reverse * 10 + remainder;
	 		num = num / 10;
	 	}

	 	return reverse;
	 }


	 //main method to test reverseInt method
	 public static void main(String... strs){

	 	Scanner scanner = new Scanner(System.in);

	 	System.out.println("Enter an integer to reverse:");


	 	int number = scanner.nextInt();

	 	System.out.println("Reversing given number %1$d is %2$d.".formatted(number, reverseInt(number)));

	 	scanner.close();
	 }
}