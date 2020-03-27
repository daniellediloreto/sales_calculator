//Danielle DiLoreto
//Assignment 5
//Write a Java program to determine if the user has enough money to make a purchase and, if the answer is yes, how much money will be left after that purchase has been made.
import java.util.Scanner;
public class Assignment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Cash on hand:");
		double amount = scan.nextDouble();
		System.out.println("Number of items:");
		int items = scan.nextInt();
		System.out.println("Price per item:");
		double price = scan.nextDouble();
		System.out.println("Sales Tax:");
		double tax = scan.nextDouble();

		double total, totalNoTax, tax1, leftOver;
		totalNoTax = items*price;
		tax1 = tax/100+1;
		total = tax1*totalNoTax;
		leftOver = amount - total;
		
		System.out.printf("Total cost of purchase: %2.2f", total);
		
		if (amount < total)
			System.out.printf("%nNot enough cash on hand to make the purchase.");
		else
			System.out.printf("%nRemaining cash after purchase: %2.2f", leftOver);
		
	}

}
