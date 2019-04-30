// Name: KAVYASREE BEZUGAM
// Class: CS 5040
// Term: Fall 2018
// Instructor: Dr. Haddad
// Assignment: 5
// IDE: Eclipse

public interface Tree_Kavyasree_Bezugam<E> extends Iterable<E> {
	/** Return true if the element is in the tree */
	public boolean search(E e);

	/**
	 * Insert element e into the BST. 
	 * Return true if the element is inserted successfully.
	 */
	public boolean insert(E e);

	/**
	 * Delete the specified element from the tree. Return true if the element is deleted successfully.
	 */
	public boolean delete(E e);

	/** Inorder traversal starting from the root */
	public void inorder();

	/** Postorder traversal starting from the root */
	public void postorder();

	/** Preorder traversal starting from the root */
	public void preorder();

	/** Returns the number of nodes in the tree */
	public int getSize();

	/** Return true if the tree is empty */
	public boolean isEmpty();
}