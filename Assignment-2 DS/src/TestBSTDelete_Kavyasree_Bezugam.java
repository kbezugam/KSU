// Name: KAVYASREE BEZUGAM
// Class: CS 5040
// Term: Fall 2018
// Instructor: Dr. Haddad
// Assignment: 5
// IDE: Eclipse

public class TestBSTDelete_Kavyasree_Bezugam {
	public static void main(String[] args) {
		BST_Kavyasree_Bezugam<String> tree = new BST_Kavyasree_Bezugam<>();
		tree.insert("George");
		tree.insert("Michael");
		tree.insert("Tom");
		tree.insert("Adam");
		tree.insert("Jones");
		tree.insert("Peter");
		tree.insert("Daniel");
		printTree(tree);
		//The BST after deleting the element George
		System.out.println("\nAfter delete George:");
		tree.delete("George");
		printTree(tree);
		//The BST after deleting the element Adam
		System.out.println("\nAfter delete Adam:");
		tree.delete("Adam");
		printTree(tree);
		//The BST after deleting the element Michael
		System.out.println("\nAfter delete Michael:");
		tree.delete("Michael");
		printTree(tree);
	}

	public static void printTree(BST_Kavyasree_Bezugam tree) {
		// Traverse tree starting from the root
		System.out.print("Inorder (sorted): ");
		tree.inorder();
		System.out.print("\nPostorder: ");
		tree.postorder();
		System.out.print("\nPreorder: ");
		tree.preorder();
		System.out.print("\nThe number of nodes is " + tree.getSize());
		System.out.println();
	}
}