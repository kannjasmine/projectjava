//comment 1
//comment 2

import java.util.Scanner;
public class lab2 {

	public static String PalindromeTester(String b) 
	{
	    String reverse = new StringBuilder(b).reverse().toString();
	    String c; 
	    if(b.equals(reverse)) { 
	        c = "Palindrome."; }
	    else {
	        c = "Not a palindrome."; }
	    return c;

	}
	public static void main (String[] args) {
		while(true) {
	    Scanner scnr = new Scanner(System.in);
	    System.out.println("Enter a sentence or a word to check if it is a palindrome: ");
	    String a = scnr.nextLine();
	    if(a.isEmpty()) {
			System.exit(0);
		}
	    String b = a.toLowerCase().replaceAll("[^a-z]","");
	    System.out.println(PalindromeTester(b)); 
	    System.out.println();
	}
}
}