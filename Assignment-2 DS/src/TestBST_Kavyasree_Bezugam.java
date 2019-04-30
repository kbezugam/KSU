// Name: KAVYASREE BEZUGAM
// Class: CS 5040
// Term: Fall 2018
// Instructor: Dr. Haddad
// Assignment: 5
// IDE: Eclipse

public class TestBST_Kavyasree_Bezugam {
	public static void main(String[] args) {
		// Create a BST,inserting  elements into the tree
		BST_Kavyasree_Bezugam<String> tree = new BST_Kavyasree_Bezugam<>();
		tree.insert("George");
		tree.insert("Michael");
		tree.insert("Tom");
		tree.insert("Adam");
		tree.insert("Jones");
		tree.insert("Peter");
		tree.insert("Daniel");

		// Traverse tree starting from the root 
		System.out.print("Inorder (sorted): ");
		tree.inorder();
		System.out.print("\nPostorder: ");
		tree.postorder();
		System.out.print("\nPreorder: ");
		tree.preorder();
		System.out.print("\nThe number of nodes is " + tree.getSize());

		// Searching for an element
		System.out.print("\nIs Peter in the tree? " + tree.search("Peter"));

		// To get a path from the root to the element Peter
		System.out.print("\nA path from the root to Peter is: ");
		java.util.ArrayList<BST_Kavyasree_Bezugam.TreeNode<String>> path = tree.path("Peter");
		for (int i = 0; path != null && i < path.size(); i++)
			System.out.print(path.get(i).element + " ");

		Integer[] numbers = { 2, 4, 3, 1, 8, 5, 6, 7 };
		BST_Kavyasree_Bezugam<Integer> intTree = new BST_Kavyasree_Bezugam<>(numbers);
		System.out.print("\nInorder (sorted): ");
		intTree.inorder();
	}
}