/*
 * checks if it is a prime number
 */

 package java_programs;

 import java.util.Scanner;

 public class PrimeChecker{

 	public static void main(String[] args){

 		Scanner scanner = new Scanner(System.in);

 		System.out.println("Enter an integer to check if it is a prime number:");

 		int num = scanner.nextInt();

 		System.out.println("%n%d %s%n".formatted(num, isPrime(num) ? "is a prime." : "is not a prime."));

 		scanner.close();


 	}

 	public static boolean isPrime(int num){

 		if (num <= 1){ return false;}
 		if(num == 2) { return true;}
 		if (num % 2 == 0){ return false;}

 		//only need to check upto maxDivisor for num
 		//to be a prime
 		int maxDivisor = (int)Math.sqrt(num);

 		for(int i = 3; i <= maxDivisor; i += 2){
 			if(num % i == 0) { return false;}
 		}

 		return true;


 	}
 }