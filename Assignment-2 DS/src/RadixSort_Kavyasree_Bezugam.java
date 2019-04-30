\//Name: KAVYASREE BEZUGAM
// Class: CS 5040
// Term: Fall 2018
// Instructor: Dr. Haddad
// Assignment: 4
// IDE: Eclipse

/*
 * This class define a RadixSort that sorts integer values.
 */
import java.util.Scanner;

public class RadixSort_Kavyasree_Bezugam {

	private static Queue_Kavyasree_Bezugam[] queue = { new Queue_Kavyasree_Bezugam(), new Queue_Kavyasree_Bezugam(),
			new Queue_Kavyasree_Bezugam(), new Queue_Kavyasree_Bezugam(), new Queue_Kavyasree_Bezugam(),
			new Queue_Kavyasree_Bezugam(), new Queue_Kavyasree_Bezugam(), new Queue_Kavyasree_Bezugam(),
			new Queue_Kavyasree_Bezugam(), new Queue_Kavyasree_Bezugam() };

	// RadixSort_Kavyasree_Bezugam Main method.
	public static void main(String[] args) {
		Scanner condition = new Scanner(System.in);
		while (true) {
			System.out.println("Do you want to sort inputs (Y/N) : ");
			String a = condition.next();
			if (a.equalsIgnoreCase("Y")) {
				Queue_Kavyasree_Bezugam myList = new Queue_Kavyasree_Bezugam();
				System.out.print("Enter integer one by one press enter ");
				System.out.println("<You can enter 6 values>:");
				Scanner inputQueueValues = new Scanner(System.in);
				for (int i=0; i<6;i++) {
					myList.enqueue(inputQueueValues.nextInt());
				}
				Integer myQueue[] = new Integer[myList.size()];
				for (int r = 0; r < myList.size(); r++) {
					myQueue[r] = myList.getAtIndex(r);
				}

				System.out.print("Inputs array before Sorting : ");
				for (int i = 0; i < myQueue.length; i++) {
					System.out.print(myQueue[i]);
					System.out.print(" ");
				}

				// call radixSort method to Sort your input array using
				Integer[] sortedList = radixSort(myQueue);
				System.out.println("");
				System.out.print("Your Input after sort using Radix Sort : ");
				for (int i = 0; i < sortedList.length; i++) {
					System.out.print(sortedList[i]);
					System.out.print(" ");
				}
				System.out.println("");
				a = inputQueueValues.nextLine();
			} else {
				break;
			}

		}
	}

	// Sorts an array of objects (integers) using radix sort.
	public static Integer[] radixSort(Integer[] inputs) {
		// Get the maximum number of digits from the given inputs.
		int maxDigits = getMaxDigits(inputs);

		// Iterate radix depending on max digits.
		for (int digit = 1; digit <= maxDigits; digit++) {
			Integer radixNumber;
			for (int n = 0; n < inputs.length; n++) {
				// extract radix number from input array
				radixNumber = extractDigit(inputs[n], digit);
				if (!(radixNumber == null)) {
					// enqueue inputs in to the corresponding queue { Q0, Q1, Q2, Q3, Q4, Q5, Q6,
					// Q7, Q8, Q9 }
					queue[radixNumber].enqueue(inputs[n]);
				}
			}

			// Go through the queues and insert the numbers back into the inputs array and
			// dequeue from the corresponding Queues.
			int a = 0;
			for (int k = 0; k < queue.length; k++) {
				// Iterate through every element in your queues { Q0, Q1, Q2, Q3, Q4, Q5, Q6,
				// Q7, Q8, Q9 }
				while (queue[k].last != null) {
					inputs[a++] = queue[k].front();
					queue[k].dequeue();
				}
			}
		}
		// return the output sorted list
		return inputs;
	}

	// Gets the maximum digits from the inputs.
	public static int getMaxDigits(Integer list[]) {
		int maxDigits = 0;
		// Iterate through the list.
		int digits;
		for (int i = 0; i < list.length; i++) {
			digits = getDigits(list[i]);
			if (digits > maxDigits) {
				maxDigits = digits;
			}
		}
		// Return the max digits from the inputs.
		return maxDigits;
	}

	// recursive method to gets the number of digits the specified number has.
	public static int getDigits(int i) {
		if (i < 10) {
			return 1;
		}
		return 1 + getDigits(i / 10);
	}

	// Gets the digit at the specified radixNumber of the specified number.
	public static Integer extractDigit(Integer number, Integer radixNumber) {
		if (!(number == null) && !(radixNumber == null)) {
			// cast to int from double, delow extracts the Digit from the Inputs
			return (int) (number / Math.pow(10, radixNumber - 1)) % 10;
		} else {
			return null;
		}
	}
}