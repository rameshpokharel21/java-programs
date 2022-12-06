/*
 * A simple java program to reverse a given string.
 */

 package java_programs;

 import java.util.Scanner;

 public class ReverseWord{

 	public static void main(String[] args){

 		Scanner scanner = new Scanner(System.in);

 		System.out.println("Enter a word to reverse:");

 		String word = scanner.nextLine();
   
   //Use StringBuilder class's reverse() method 
   String reverse = new StringBuilder(word).reverse().toString();
 		System.out.println("The reverse of \'%s\' is \'%s\'.%n".formatted(word, reverse));

 		scanner.close();
 	}

 	
 }
