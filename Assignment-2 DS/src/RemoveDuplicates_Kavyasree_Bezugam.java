
// Name: KAVYASREE BEZUGAM
// Class: CS 5040
// Term: Fall 2018
// Instructor: Dr. Haddad
// Assignment: 5
// IDE: Eclipse

import java.util.Scanner;

public class RemoveDuplicates_Kavyasree_Bezugam {

	public static void main(String[] args) {
		Scanner condition = new Scanner(System.in);
		while (true) {
			System.out.println("Do you want to remove dupilicates from your inputs text (Y/N) : ");
			String a = condition.next();
			if (a.equalsIgnoreCase("Y")) {
				Scanner inputStackValues = new Scanner(System.in);
				System.out.print("Input text ");
				System.out.println("<Press enter button if you finish inputting string>:");
				String input = inputStackValues.nextLine();// scanning the input
				System.out.println("Original Text: ");
				System.out.println(input);
				String[] splited = input.split(" ");// Splitting the input
				BST_Kavyasree_Bezugam bst = new BST_Kavyasree_Bezugam();
				for (int i = 0; i < splited.length; i++) {
					//Insert string one by one in to BST
					bst.insert(splited[i]);
				}
				System.out.println("Processed Text:");
				bst.inorder();// Traverses the BST and prints out the words inorder.
				bst.clear();//Flush the BST
				System.out.println("");
			} else {
				break;
			}
		}

	}

}
